package weather.bizlogic;

import org.junit.jupiter.api.Test;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static weather.utils.TestUtils.readJsonNodeFromResources;

public class WeatherDataTest {
    @Test
    public void canComputeStatistics() {
        WeatherData rawData = new WeatherData(readJsonNodeFromResources("/openWeatherResponse.json"));

        Map<DataGroupingCriteria, IntSummaryStatistics> humidityStatistics = rawData.humidityStatistics();
        Map<DataGroupingCriteria, DoubleSummaryStatistics> tempStatistics = rawData.tempStatistics();

        assertArrayEquals(humidityStatistics.keySet().toArray(), tempStatistics.keySet().toArray());

        Object[] days = humidityStatistics.keySet().stream().map(DataGroupingCriteria::getDay).distinct().sorted().toArray();

        assertArrayEquals(new Object[] {"2020-12-12", "2020-12-13", "2020-12-14"}, days);
    }
}
