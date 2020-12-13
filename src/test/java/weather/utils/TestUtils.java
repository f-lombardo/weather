package weather.utils;

import com.fasterxml.jackson.databind.JsonNode;

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
        return JsonUtils.readTree(readStringFromResources(resourceName));
    }

}
