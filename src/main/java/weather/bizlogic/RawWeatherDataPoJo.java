package weather.bizlogic;

import java.util.ArrayList;
import java.util.List;

public class RawWeatherDataPoJo {
    private int timezone_offset;
    private List<HourlyDataPojo> hourly;

    public int getTimezone_offset() {
        return timezone_offset;
    }

    public void setTimezone_offset(int timezone_offset) {
        this.timezone_offset = timezone_offset;
    }

    public List<HourlyDataPojo> getHourly() {
        return hourly;
    }

    public void setHourly(List<HourlyDataPojo> hourly) {
        this.hourly = hourly;
    }


    public List<HourlyData> getRawHourlyData() {
        ArrayList<HourlyData> result = new ArrayList<>();
        for (HourlyDataPojo pojo: hourly) {
            result.add(new HourlyData(
                    pojo.getDt(),
                    timezone_offset,
                    pojo.getTemp(),
                    pojo.getHumidity()
            ));
        }
        return result;
    }
}
