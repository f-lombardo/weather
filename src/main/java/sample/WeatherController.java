package sample;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sample.bizlogic.Statistics;
import sample.bizlogic.Weather;
import sample.bizlogic.DailyData;

import java.util.Arrays;
import java.util.List;

@RestController
public class WeatherController {

    @GetMapping(value = "/weather")
    public ResponseEntity<Weather> weather(@Valid @RequestParam String city) {
        List<DailyData> forecast = Arrays.asList(
                new DailyData("2020-12-20",
                        new Statistics(10.0, 15.0, 12.5),
                        new Statistics(82, 83, 82),
                        new Statistics(10.0, 15.0, 12.5),
                        new Statistics(82, 83, 82)
                ),
                new DailyData("2020-12-20",
                        new Statistics(10.0, 15.0, 12.5),
                        new Statistics(82, 83, 82),
                        new Statistics(10.0, 15.0, 12.5),
                        new Statistics(82, 83, 82)
                ),
                new DailyData("2020-12-20",
                        new Statistics(10.0, 15.0, 12.5),
                        new Statistics(82, 83, 82),
                        new Statistics(10.0, 15.0, 12.5),
                        new Statistics(82, 83, 82)
                )
        );
        return ResponseEntity.ok(new Weather(city, forecast));
    }

}
