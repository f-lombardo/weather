package weather.bizlogic;

public class WeatherSearch {
    private final GeolocationService geolocationService;
    private final WeatherDataService weatherDataService;

    public WeatherSearch(GeolocationService geolocationService, WeatherDataService weatherDataService) {
        this.geolocationService = geolocationService;
        this.weatherDataService = weatherDataService;
    }

    public Weather findWeatherFor(String city) {
        return new Weather(city, new WeatherData(weatherDataService.rawWeatherDataFor(geolocationService.getGeoPosition(city))).toDailyData());
    }
}
