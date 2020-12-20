package weather.external;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import weather.bizlogic.GeoPosition;
import weather.bizlogic.RawWeatherDataPoJo;
import weather.bizlogic.WeatherDataService;
import weather.boot.ApplicationConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = ApplicationConfiguration.class)
public class HttpWeatherDataServiceTestIT {

    @Autowired
    private WeatherDataService service;

    @Test
    public void canReadWeatherPojoForMilan() {
        GeoPosition milan = new GeoPosition(45.4654219, 9.1859243);
        RawWeatherDataPoJo weatherInMilan = service.rawWeatherDataFor(milan);
        assertEquals(3600, weatherInMilan.getTimezone_offset());
        assertEquals(48, weatherInMilan.getHourly().size());
    }
}
