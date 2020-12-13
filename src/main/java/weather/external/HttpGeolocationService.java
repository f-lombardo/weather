package weather.external;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import weather.bizlogic.GeoPosition;
import weather.bizlogic.GeolocationService;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

public class HttpGeolocationService implements GeolocationService {
    private final RestTemplate restTemplate;
    private final String key;

    public HttpGeolocationService(RestTemplate restTemplate, String key) {
        this.restTemplate = restTemplate;
        this.key = key;
    }

    @Override
    public GeoPosition getGeoPosition(String city) {
        ResponseEntity<JsonNode> response = restTemplate.getForEntity(urlFor(city), JsonNode.class);
        JsonNode body = response.getBody();
        if (!response.getStatusCode().is2xxSuccessful()) {
            throw new RuntimeException("Error searching city " + city + " - " + body);
        }

        Iterator<JsonNode> resultsElements = body.findValue("results").elements();
        if (!resultsElements.hasNext()) {
            throw new RuntimeException("Error searching city " + city + "- not found");
        }

        JsonNode firsResponse = resultsElements.next();
        JsonNode geometry = firsResponse.findValue("geometry");
        return new GeoPosition(geometry.findValue("lat").asDouble(), geometry.findValue("lng").asDouble());
    }

    private String urlFor(String city) {
        return "https://api.opencagedata.com/geocode/v1/json?" +
                "q=" + encode(city) +
                "&key=" + key;
    }

    private String encode(String city) {
        try {
            return URLEncoder.encode(city, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
