package weather.bizlogic;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class WeatherData {
    private final RawWeatherData rawData;

    public WeatherData(JsonNode jsonNode) {
        this.rawData = new RawWeatherData(jsonNode);
    }

    public WeatherData(String jsonString) {
        this.rawData = new RawWeatherData(jsonString);
    }

    private Stream<HourlyData>hourlyDataStream() {
        return rawData.getRawHourlyData().stream();
    }

    public Map<GroupDataByDayAndWorkingHoursFlag, DoubleSummaryStatistics> tempStatistics() {
        return hourlyDataStream().collect(
                groupingBy(HourlyData::toDataGroupingCriteria, summarizingDouble(HourlyData::getTemp)));
    }

    public Map<GroupDataByDayAndWorkingHoursFlag, IntSummaryStatistics> humidityStatistics() {
        return hourlyDataStream().collect(
                groupingBy(HourlyData::toDataGroupingCriteria, summarizingInt(HourlyData::getHumidity)));
    }

    public Collection<DailyData> toDailyData() {
        SortedMap<String, DailyData> result = new TreeMap<String, DailyData>();

        Map<GroupDataByDayAndWorkingHoursFlag, DoubleSummaryStatistics> tempStatistics = tempStatistics();
        Map<GroupDataByDayAndWorkingHoursFlag, IntSummaryStatistics> humidityStatistics = humidityStatistics();
        Set<GroupDataByDayAndWorkingHoursFlag> keys = tempStatistics.keySet();

        for (GroupDataByDayAndWorkingHoursFlag key: keys) {
            String day = key.getDay();
            DailyData dailyData = result.getOrDefault(day, new DailyData(day));
            dailyData.setTemperature(key.isWorkingHour(), tempStatistics.get(key));
            dailyData.setHumidity(key.isWorkingHour(), humidityStatistics.get(key));
            result.put(day, dailyData);
        }

        return result.values();
    }

}
