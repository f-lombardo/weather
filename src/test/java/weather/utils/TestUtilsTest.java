package weather.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static weather.utils.TestUtils.readJsonNodeFromResources;
import static weather.utils.TestUtils.readStringFromResources;

public class TestUtilsTest {
    @Test
    public void canReadStringFromResources() {
        assertTrue(
            readStringFromResources("/openWeatherResponse.json").contains("\"lat\": 51.44")
        );
    }

    @Test
    public void canReadJsonNodeFromResources() {
        assertEquals("51.44", readJsonNodeFromResources("/openWeatherResponse.json").findValue("lat").asText());
    }
}
