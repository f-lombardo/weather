package weather.bizlogic;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static weather.utils.TestUtils.*;

public class WeatherDataUnmarshallTest {
    @Test
    public void x() {
        JsonNode wheatherJsonNode = readJsonNodeFromResources("/openWeatherResponse.json");
        List<JsonNode> hourlyData = wheatherJsonNode.findValues("hourly");
        Stream<RawHourlyData> rawHourlyDataStream =
                hourlyData.stream().map(node -> new RawHourlyData(node.findValue("dt").asLong(),
                                                                  node.findValue("timezone_offset").asInt(),
                                                                  node.findValue("temp").asDouble(),
                                                                  node.findValue("humidity").asInt()))
                ;
    }
}
