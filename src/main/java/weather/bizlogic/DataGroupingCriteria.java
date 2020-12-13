package weather.bizlogic;

import java.util.Objects;

public class DataGroupingCriteria implements Comparable<DataGroupingCriteria> {
    private final String day;
    private final Boolean isWorkingHour;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataGroupingCriteria that = (DataGroupingCriteria) o;
        return isWorkingHour == that.isWorkingHour &&
                Objects.equals(day, that.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, isWorkingHour);
    }


    @Override
    public int compareTo(DataGroupingCriteria other) {
        int dayCompare = day.compareTo(other.day);
        if (dayCompare == 0) {
            return isWorkingHour.compareTo(other.isWorkingHour);
        }
        return dayCompare;
    }
}
