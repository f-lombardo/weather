package weather.bizlogic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static weather.utils.TestUtils.readJsonNodeFromResources;

public class RawWeatherDataTest {
    @Test
    public void canUnmarshallJsonToRawHourlyData() {
        RawWeatherData rawData = new RawWeatherData(readJsonNodeFromResources("/openWeatherResponse.json"));
        assertEquals(48, rawData.getRawHourlyData().size());
    }
}
