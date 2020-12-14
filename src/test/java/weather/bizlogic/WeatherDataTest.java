package weather.bizlogic;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static weather.utils.TestUtils.readJsonNodeFromResources;

public class WeatherDataTest {

    private final static Object[] sampleDays = {"2020-12-14", "2020-12-15", "2020-12-16"};

    @Test
    public void canComputeStatistics() {
        WeatherData rawData = new WeatherData(readJsonNodeFromResources("/openWeatherResponse.json"));

        Map<GroupDataByDayAndWorkingHoursFlag, IntSummaryStatistics> humidityStatistics = rawData.humidityStatistics();
        Map<GroupDataByDayAndWorkingHoursFlag, DoubleSummaryStatistics> tempStatistics = rawData.tempStatistics();

        assertArrayEquals(humidityStatistics.keySet().toArray(), tempStatistics.keySet().toArray());

        Object[] days = humidityStatistics.keySet().stream().map(GroupDataByDayAndWorkingHoursFlag::getDay).distinct().sorted().toArray();

        assertArrayEquals(sampleDays, days);
    }

    @Test
    public void canBeTransformedToDailyData() {
        WeatherData rawData = new WeatherData(readJsonNodeFromResources("/openWeatherResponse.json"));
        Collection<DailyData> dailyData = rawData.toDailyData();
        assertEquals(3, dailyData.size());

        assertArrayEquals(sampleDays, dailyData.stream().map(DailyData::getDay).toArray());

        DailyData firstDay = dailyData.iterator().next();

        assertEquals(8.68, firstDay.getNonWorkingHoursTemperature().getMin());
        assertEquals(9.76, firstDay.getNonWorkingHoursTemperature().getMax());
        assertEquals(9.233, firstDay.getNonWorkingHoursTemperature().getAverage(), 0.001);
    }
}
