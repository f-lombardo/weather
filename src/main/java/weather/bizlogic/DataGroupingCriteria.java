package weather.bizlogic;

public class DataGroupingCriteria {
    private final String day;
    private final boolean isWorkingHour;

    public DataGroupingCriteria(String day, boolean isWorkingHour) {
        this.day = day;
        this.isWorkingHour = isWorkingHour;
    }

    public String getDay() {
        return day;
    }

    public boolean isWorkingHour() {
        return isWorkingHour;
    }
}
