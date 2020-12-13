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
    @Test
    public void canComputeStatistics() {
        WeatherData rawData = new WeatherData(readJsonNodeFromResources("/openWeatherResponse.json"));

        Map<GroupDataByDayAndWorkingHoursFlag, IntSummaryStatistics> humidityStatistics = rawData.humidityStatistics();
        Map<GroupDataByDayAndWorkingHoursFlag, DoubleSummaryStatistics> tempStatistics = rawData.tempStatistics();

        assertArrayEquals(humidityStatistics.keySet().toArray(), tempStatistics.keySet().toArray());

        Object[] days = humidityStatistics.keySet().stream().map(GroupDataByDayAndWorkingHoursFlag::getDay).distinct().sorted().toArray();

        assertArrayEquals(new Object[] {"2020-12-12", "2020-12-13", "2020-12-14"}, days);
    }

    @Test
    public void canBeTransformedToDailyData() {
        WeatherData rawData = new WeatherData(readJsonNodeFromResources("/openWeatherResponse.json"));
        Collection<DailyData> dailyData = rawData.toDailyData();
        assertEquals(3, dailyData.size());

        assertArrayEquals(new Object[] {"2020-12-12", "2020-12-13", "2020-12-14"}, dailyData.stream().map(DailyData::getDay).toArray());

        DailyData firstDay = dailyData.iterator().next();

        assertEquals(5.32, firstDay.getNonWorkingHoursTemperature().getMin());
        assertEquals(7.57, firstDay.getNonWorkingHoursTemperature().getMax());
        assertEquals(6.283, firstDay.getNonWorkingHoursTemperature().getAverage(), 0.001);
    }
}
