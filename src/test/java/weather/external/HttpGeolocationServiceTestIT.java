package weather.external;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import weather.bizlogic.GeoPosition;
import weather.bizlogic.GeolocationService;
import weather.boot.ApplicationConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = ApplicationConfiguration.class)
class HttpGeolocationServiceTestIT {
    @Autowired
    private GeolocationService service;

    @Test
    public void canReadGeoLocationForMilan() {
        GeoPosition milan = service.getGeoPosition("milan");
        assertEquals(45.4668, milan.lat);
        assertEquals(9.1905, milan.lon);
    }
}
