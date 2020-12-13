package weather.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TestUtils {

    public static String readStringFromResources(String resourceName) {
        try {
            return new String(Files.readAllBytes(Paths.get(TestUtils.class.getResource(resourceName).toURI())));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonNode readJsonNodeFromResources(String resourceName) {
        try {
            return defaultObjectMapper().readTree(readStringFromResources(resourceName));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static ObjectMapper defaultObjectMapper() {
        return new ObjectMapper().registerModule(new JavaTimeModule());
    }

}
