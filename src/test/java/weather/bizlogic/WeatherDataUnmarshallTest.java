package weather.bizlogic;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static weather.utils.TestUtils.readJsonNodeFromResources;

public class WeatherDataUnmarshallTest {
    @Test
    public void x() {
        JsonNode wheatherJsonNode = readJsonNodeFromResources("/openWeatherResponse.json");
        List<JsonNode> hourlyData = wheatherJsonNode.findValues("hourly");
        Stream<RawHourlyData> rawHourlyDataStream =
                hourlyData.stream().map(node -> new RawHourlyData(node.findValue("dt").asLong(),
                                                                  wheatherJsonNode.findValue("timezone_offset").asInt(),
                                                                  node.findValue("temp").asDouble(),
                                                                  node.findValue("humidity").asInt()))
                ;
        Map<DataGroupingCriteria, DoubleSummaryStatistics> tempStatistics =
                rawHourlyDataStream.collect(
                        groupingBy(RawHourlyData::toDataGroupingCriteria, summarizingDouble(RawHourlyData::getTemp)));

        Map<DataGroupingCriteria, IntSummaryStatistics> humidityStatistics =
                rawHourlyDataStream.collect(
                        groupingBy(RawHourlyData::toDataGroupingCriteria, summarizingInt(RawHourlyData::getHumidity)));

    }
}
