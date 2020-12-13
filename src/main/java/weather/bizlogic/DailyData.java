package weather.bizlogic;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;

public class DailyData {
    private final String day;
    private Statistics workingHoursTemperature;
    private Statistics nonWorkingHoursTemperature;
    private Statistics nonWorkingHoursHumidity;
    private Statistics workingHoursHumidity;

    public DailyData(String day) {
        this.day = day;
    }

    public void setTemperature(boolean workingHour, DoubleSummaryStatistics temperature) {
        if (workingHour) {
            this.workingHoursTemperature = new Statistics(temperature);
        } else {
            this.nonWorkingHoursTemperature = new Statistics(temperature);
        }
    }

    public void setHumidity(boolean workingHour, IntSummaryStatistics humidity) {
        if (workingHour) {
            this.workingHoursHumidity = new Statistics(humidity);
        } else {
            this.nonWorkingHoursHumidity = new Statistics(humidity);
        }
    }


    public String getDay() {
        return day;
    }

    public Statistics getWorkingHoursHumidity() {
        return workingHoursHumidity;
    }


    public Statistics getWorkingHoursTemperature() {
        return workingHoursTemperature;
    }

    public Statistics getNonWorkingHoursTemperature() {
        return nonWorkingHoursTemperature;
    }

    public Statistics getNonWorkingHoursHumidity() {
        return nonWorkingHoursHumidity;
    }

}
