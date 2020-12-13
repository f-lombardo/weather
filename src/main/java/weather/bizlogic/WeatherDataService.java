package weather.bizlogic;

import com.fasterxml.jackson.databind.JsonNode;

public interface WeatherDataService {
    public JsonNode weatherJsonFor(GeoPosition position);
}
