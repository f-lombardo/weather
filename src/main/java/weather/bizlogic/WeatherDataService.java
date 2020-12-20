package weather.bizlogic;

public interface WeatherDataService {
    public RawWeatherDataPoJo rawWeatherDataFor(GeoPosition position);
}
