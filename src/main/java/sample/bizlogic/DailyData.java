package sample.bizlogic;

public class DailyData {
    private final String day;
    private final Statistics workingHoursTemperature;
    private final Statistics workingHoursHumidity;
    private final Statistics nonWorkingHoursTemperature;
    private final Statistics nonWorkingHoursHumidity;

    public DailyData(String day,
                     Statistics workingHoursTemperature,
                     Statistics workingHoursHumidity,
                     Statistics nonWorkingHoursTemperature,
                     Statistics nonWorkingHoursHumidity) {
        this.day = day;
        this.workingHoursTemperature = workingHoursTemperature;
        this.workingHoursHumidity = workingHoursHumidity;
        this.nonWorkingHoursTemperature = nonWorkingHoursTemperature;
        this.nonWorkingHoursHumidity = nonWorkingHoursHumidity;
    }

    public String getDay() { return day; }

    public Statistics getWorkingHoursTemperature() {
        return workingHoursTemperature;
    }

    public Statistics getWorkingHoursHumidity() {
        return workingHoursHumidity;
    }

    public Statistics getNonWorkingHoursTemperature() {
        return nonWorkingHoursTemperature;
    }

    public Statistics getNonWorkingHoursHumidity() {
        return nonWorkingHoursHumidity;
    }
}
