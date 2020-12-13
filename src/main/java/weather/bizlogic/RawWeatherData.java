package weather.bizlogic;

import com.fasterxml.jackson.databind.JsonNode;
import weather.utils.JsonUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RawWeatherData {
    private final List<HourlyData> rawHourlyData;
    private final int timeZoneOffset;

    public RawWeatherData(String jsonString) {
        this(JsonUtils.readTree((jsonString)));
    }

    public RawWeatherData(JsonNode jsonNode) {
        this.rawHourlyData = new ArrayList<>();
        Iterator<JsonNode> hourly = jsonNode.findValue("hourly").elements();
        this.timeZoneOffset = jsonNode.findValue("timezone_offset").asInt();
        while (hourly.hasNext()) {
            JsonNode node = hourly.next();
            rawHourlyData.add(new HourlyData(node.findValue("dt").asLong(),
                    timeZoneOffset,
                    node.findValue("temp").asDouble(),
                    node.findValue("humidity").asInt()));
        }
    }

    public List<HourlyData> getRawHourlyData() {
        return rawHourlyData;
    }

}
