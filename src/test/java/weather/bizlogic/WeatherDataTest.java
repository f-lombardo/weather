package weather.bizlogic;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static weather.utils.JsonUtils.defaultObjectMapper;
import static weather.utils.TestUtils.readStringFromResources;

public class WeatherDataTest {

    private final static Object[] sampleDays = {"2020-12-14", "2020-12-15", "2020-12-16"};

    @Test
    public void canComputeStatistics() throws JsonProcessingException {
        WeatherData rawData = new WeatherData(getRawDataFromExample());

        Map<GroupDataByDayAndWorkingHoursFlag, IntSummaryStatistics> humidityStatistics = rawData.humidityStatistics();
        Map<GroupDataByDayAndWorkingHoursFlag, DoubleSummaryStatistics> tempStatistics = rawData.tempStatistics();

        assertArrayEquals(humidityStatistics.keySet().toArray(), tempStatistics.keySet().toArray());

        Object[] days = humidityStatistics.keySet().stream().map(GroupDataByDayAndWorkingHoursFlag::getDay).distinct().sorted().toArray();

        assertArrayEquals(sampleDays, days);
    }

    private RawWeatherDataPoJo getRawDataFromExample() throws JsonProcessingException {
        return defaultObjectMapper().readValue(readStringFromResources("/openWeatherResponse.json"), RawWeatherDataPoJo.class);
    }

    @Test
    public void canBeTransformedToDailyData() throws JsonProcessingException {
        WeatherData rawData = new WeatherData(getRawDataFromExample());
        Collection<DailyData> dailyData = rawData.toDailyData();
        assertEquals(3, dailyData.size());

        assertArrayEquals(sampleDays, dailyData.stream().map(DailyData::getDay).toArray());

        DailyData firstDay = dailyData.iterator().next();

        assertEquals(8.68, firstDay.getNonWorkingHoursTemperature().getMin());
        assertEquals(9.76, firstDay.getNonWorkingHoursTemperature().getMax());
        assertEquals(9.233, firstDay.getNonWorkingHoursTemperature().getAverage(), 0.001);
    }
}
