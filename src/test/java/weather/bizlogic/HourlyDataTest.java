package weather.bizlogic;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class HourlyDataTest {

    @Test
    public void canDetectDaysBasedOnTimeZone() {
        HourlyData hourlyDataDuringNight = new HourlyData(1607914800, -21600, 3.93, 86);
        assertEquals("2020-12-13", hourlyDataDuringNight.day());
        assertFalse(hourlyDataDuringNight.isWorkingHour());

        HourlyData hourlyDataDuringDay = new HourlyData(1607914800 + (14 * 60 * 60), -21600, 3.93, 86);
        assertEquals("2020-12-14", hourlyDataDuringDay.day());
        assertTrue(hourlyDataDuringDay.isWorkingHour());
    }

    @Test
    public void workingHoursAreFlexible() {
        HourlyData hourlyDataDuringNight = new HourlyData(1607914800, -21600, 3.93, 86);
        assertEquals("2020-12-13", hourlyDataDuringNight.day());
        assertTrue(hourlyDataDuringNight.isWorkingHour(LocalTime.of(0, 0), LocalTime.of(23, 59)));
        assertFalse(hourlyDataDuringNight.isWorkingHour(LocalTime.of(1, 0), LocalTime.of(1, 0)));
    }
}
