package sample.bizlogic;

import java.util.List;

public class Weather {
    private final String city;
    private final List<DailyData> forecast;

    public Weather(String city, List<DailyData> forecast) {
        this.city = city;
        this.forecast = forecast;
    }

    public String getCity() {
        return city;
    }

    public List<DailyData> getForecast() {
        return forecast;
    }
}
