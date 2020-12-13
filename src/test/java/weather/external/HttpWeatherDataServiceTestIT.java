package weather.external;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import weather.bizlogic.GeoPosition;
import weather.bizlogic.WeatherDataService;
import weather.boot.ApplicationConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = ApplicationConfiguration.class)
public class HttpWeatherDataServiceTestIT {

    @Autowired
    private WeatherDataService service;

    @Test
    public void canReadWeatherForMilan() {
        GeoPosition milan = new GeoPosition(45.4654219, 9.1859243);
        JsonNode weatherInMilan = service.weatherJsonFor(milan);
        assertEquals("Europe/Rome", weatherInMilan.findValue("timezone").asText());
    }
}
