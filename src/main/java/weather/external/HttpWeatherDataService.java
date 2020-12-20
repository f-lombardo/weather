package weather.external;

import org.springframework.web.client.RestTemplate;
import weather.bizlogic.GeoPosition;
import weather.bizlogic.RawWeatherDataPoJo;
import weather.bizlogic.WeatherDataService;

public class HttpWeatherDataService implements WeatherDataService {
    private final RestTemplate restTemplate;
    private final String appId;

    public HttpWeatherDataService(RestTemplate restTemplate, String appId) {
        this.restTemplate = restTemplate;
        this.appId = appId;
    }


    @Override
    public RawWeatherDataPoJo rawWeatherDataFor(GeoPosition position) {
        return restTemplate.getForEntity(urlFor(position), RawWeatherDataPoJo.class).getBody();
    }

    private String urlFor(GeoPosition position) {
        return "https://api.openweathermap.org/data/2.5/onecall?" +
               "lat=" + position.lat + "&lon=" + position.lon +
                "&units=metric&exclude=minutely,alerts,current,daily&appid=" + appId;
    }
}
