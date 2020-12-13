package weather.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import weather.bizlogic.GeolocationService;
import weather.bizlogic.WeatherDataService;
import weather.external.HttpGeolocationService;
import weather.external.HttpWeatherDataService;

@Configuration
public class ApplicationConfiguration {

    @Value("${OPENWEATHERMAP_APPID}")
    private String openweathermapAppId;

    @Value("${OPENCAGEDATA_KEY}")
    private String opencageKey;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder()
                .requestFactory(() -> new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()))
                .build();
    }

    @Bean
    public WeatherDataService getWeatherDataService() {
        return new HttpWeatherDataService(restTemplate(), openweathermapAppId);
    }

    @Bean
    public GeolocationService getGeolocationService() {
        return new HttpGeolocationService(restTemplate(), opencageKey);
    }
}
