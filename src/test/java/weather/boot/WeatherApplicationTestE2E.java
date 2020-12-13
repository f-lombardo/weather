package weather.boot;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = {ApplicationConfiguration.class, WeatherApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WeatherApplicationTestE2E {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void canReadWeatherData() {
        ResponseEntity<JsonNode> response = restTemplate.getForEntity("/weather?city=milan", JsonNode.class);
        assertTrue(response.getStatusCode().is2xxSuccessful());
        assertEquals("milan", response.getBody().findValue("city").asText());
    }

    @Test
    public void returnsKOForWrongCity() {
        ResponseEntity<JsonNode> response = restTemplate.getForEntity("/weather?city=jbkjsbkgbsfbg", JsonNode.class);
        assertTrue(response.getStatusCode().is4xxClientError());
    }
}
