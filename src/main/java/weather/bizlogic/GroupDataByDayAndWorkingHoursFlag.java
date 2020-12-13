package weather.bizlogic;

import java.util.Objects;

public class GroupDataByDayAndWorkingHoursFlag implements Comparable<GroupDataByDayAndWorkingHoursFlag> {
    private final String day;
    private final Boolean isWorkingHour;

    public GroupDataByDayAndWorkingHoursFlag(String day, boolean isWorkingHour) {
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
        GroupDataByDayAndWorkingHoursFlag that = (GroupDataByDayAndWorkingHoursFlag) o;
        return isWorkingHour == that.isWorkingHour &&
                Objects.equals(day, that.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, isWorkingHour);
    }


    @Override
    public int compareTo(GroupDataByDayAndWorkingHoursFlag other) {
        int dayCompare = day.compareTo(other.day);
        if (dayCompare == 0) {
            return isWorkingHour.compareTo(other.isWorkingHour);
        }
        return dayCompare;
    }
}
