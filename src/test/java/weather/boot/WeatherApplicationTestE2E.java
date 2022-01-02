package weather.boot;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {ApplicationConfiguration.class, WeatherApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WeatherApplicationTestE2E {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void canReadWeatherData() {
        ResponseEntity<JsonNode> response = restTemplate.getForEntity("/weather?city=milan", JsonNode.class);
        assertIsSuccessful(response.getStatusCode());
        assertEquals("milan", response.getBody().findValue("city").asText());
    }

    private void assertIsSuccessful(HttpStatus status) {
        if (!status.is2xxSuccessful()) {
            fail("Expected a 2xx but was " + status.toString());
        }
    }

    @Test
    public void returnsKOForWrongCity() {
        ResponseEntity<JsonNode> response = restTemplate.getForEntity("/weather?city=jbkjsbkgbsfbg", JsonNode.class);
        assertTrue(response.getStatusCode().is4xxClientError());
    }
}
