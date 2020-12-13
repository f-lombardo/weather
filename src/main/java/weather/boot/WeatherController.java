package weather.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import weather.bizlogic.GeolocationService;
import weather.bizlogic.Weather;
import weather.bizlogic.WeatherDataService;
import weather.bizlogic.WeatherSearch;

import javax.validation.Valid;

@RestController
public class WeatherController {

    @Autowired
    private WeatherDataService weatherDataService;

    @Autowired
    private GeolocationService geolocationService;

    @GetMapping(value = "/weather")
    public ResponseEntity<Weather> weather(@Valid @RequestParam String city) {
        try {
            WeatherSearch weatherSearch = new WeatherSearch(geolocationService, weatherDataService);
            return ResponseEntity.ok(weatherSearch.findWeatherFor(city));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

}
