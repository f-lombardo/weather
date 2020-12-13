package weather.bizlogic;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class RawHourlyDataTest {

    @Test
    public void canDetectDaysBasedOnTimeZone() {
        RawHourlyData rawHourlyDataDuringNight = new RawHourlyData(1607914800, -21600, 3.93, 86);
        assertEquals("2020-12-13", rawHourlyDataDuringNight.day());
        assertFalse(rawHourlyDataDuringNight.isWorkingHour());

        RawHourlyData rawHourlyDataDuringDay = new RawHourlyData(1607914800 + (14 * 60 * 60), -21600, 3.93, 86);
        assertEquals("2020-12-14", rawHourlyDataDuringDay.day());
        assertTrue(rawHourlyDataDuringDay.isWorkingHour());
    }

    @Test
    public void workingHoursAreFlexible() {
        RawHourlyData rawHourlyDataDuringNight = new RawHourlyData(1607914800, -21600, 3.93, 86);
        assertEquals("2020-12-13", rawHourlyDataDuringNight.day());
        assertTrue(rawHourlyDataDuringNight.isWorkingHour(LocalTime.of(0, 0), LocalTime.of(23, 59)));
        assertFalse(rawHourlyDataDuringNight.isWorkingHour(LocalTime.of(1, 0), LocalTime.of(1, 0)));
    }
}
