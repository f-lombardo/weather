package weather.bizlogic;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class HourlyData {
    private final double temp;
    private final int humidity;
    private final LocalDateTime localTime;

    public HourlyData(long greenwichTime, int timezone_offset, double temp, int humidity) {
        this.localTime =
                Instant.ofEpochMilli(greenwichTime * 1000).atOffset(ZoneOffset.ofTotalSeconds(timezone_offset)).toLocalDateTime();
        this.temp = temp;
        this.humidity = humidity;
    }

    public String day() {
        return localTime.format(DateTimeFormatter.ISO_DATE);
    }

    public double getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public boolean isWorkingHour() {
        return isWorkingHour(LocalTime.of(9, 00), LocalTime.of(18, 00));
    }

    public boolean isWorkingHour(LocalTime start, LocalTime end) {
        return localTime.toLocalTime().isAfter(start)
                &&
                localTime.toLocalTime().isBefore(end);
    }

    public DataGroupingCriteria toDataGroupingCriteria() {
        return new DataGroupingCriteria(day(), isWorkingHour());
    }
}
