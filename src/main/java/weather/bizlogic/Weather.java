package weather.bizlogic;

import java.util.Collection;

public class Weather {
    private final String city;
    private final Collection<DailyData> forecast;

    public Weather(String city, Collection<DailyData> forecast) {
        this.city = city;
        this.forecast = forecast;
    }

    public String getCity() {
        return city;
    }

    public Collection<DailyData> getForecast() {
        return forecast;
    }
}
