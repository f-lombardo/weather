package weather.boot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import weather.bizlogic.Weather;
import weather.bizlogic.WeatherData;

import javax.validation.Valid;

@RestController
public class WeatherController {

    @GetMapping(value = "/weather")
    public ResponseEntity<Weather> weather(@Valid @RequestParam String city) {
        return ResponseEntity.ok(new Weather(city, new WeatherData(json).toDailyData()));
    }

    private String json = "{\n" +
            "  \"lat\": 33.44,\n" +
            "  \"lon\": -94.04,\n" +
            "  \"timezone\": \"America/Chicago\",\n" +
            "  \"timezone_offset\": -21600,\n" +
            "  \"hourly\": [\n" +
            "    {\n" +
            "      \"dt\": 1607788800,\n" +
            "      \"temp\": 8.57,\n" +
            "      \"feels_like\": 4.11,\n" +
            "      \"pressure\": 1019,\n" +
            "      \"humidity\": 61,\n" +
            "      \"dew_point\": 1.48,\n" +
            "      \"uvi\": 1.47,\n" +
            "      \"clouds\": 1,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.86,\n" +
            "      \"wind_deg\": 300,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607792400,\n" +
            "      \"temp\": 9.02,\n" +
            "      \"feels_like\": 4.78,\n" +
            "      \"pressure\": 1019,\n" +
            "      \"humidity\": 64,\n" +
            "      \"dew_point\": 2.58,\n" +
            "      \"uvi\": 2.34,\n" +
            "      \"clouds\": 1,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.81,\n" +
            "      \"wind_deg\": 298,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607796000,\n" +
            "      \"temp\": 10.05,\n" +
            "      \"feels_like\": 5.85,\n" +
            "      \"pressure\": 1019,\n" +
            "      \"humidity\": 64,\n" +
            "      \"dew_point\": 3.56,\n" +
            "      \"uvi\": 2.84,\n" +
            "      \"clouds\": 0,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.99,\n" +
            "      \"wind_deg\": 295,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607799600,\n" +
            "      \"temp\": 11.15,\n" +
            "      \"feels_like\": 7.29,\n" +
            "      \"pressure\": 1018,\n" +
            "      \"humidity\": 60,\n" +
            "      \"dew_point\": 3.68,\n" +
            "      \"uvi\": 2.65,\n" +
            "      \"clouds\": 0,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.54,\n" +
            "      \"wind_deg\": 292,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607803200,\n" +
            "      \"temp\": 11.69,\n" +
            "      \"feels_like\": 8.2,\n" +
            "      \"pressure\": 1017,\n" +
            "      \"humidity\": 59,\n" +
            "      \"dew_point\": 3.95,\n" +
            "      \"uvi\": 1.98,\n" +
            "      \"clouds\": 0,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.08,\n" +
            "      \"wind_deg\": 290,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607806800,\n" +
            "      \"temp\": 11.75,\n" +
            "      \"feels_like\": 8.46,\n" +
            "      \"pressure\": 1017,\n" +
            "      \"humidity\": 59,\n" +
            "      \"dew_point\": 4.12,\n" +
            "      \"uvi\": 1.1,\n" +
            "      \"clouds\": 0,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 2.82,\n" +
            "      \"wind_deg\": 284,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607810400,\n" +
            "      \"temp\": 11.17,\n" +
            "      \"feels_like\": 7.99,\n" +
            "      \"pressure\": 1017,\n" +
            "      \"humidity\": 63,\n" +
            "      \"dew_point\": 4.49,\n" +
            "      \"uvi\": 0.4,\n" +
            "      \"clouds\": 0,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 2.77,\n" +
            "      \"wind_deg\": 296,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607814000,\n" +
            "      \"temp\": 8.94,\n" +
            "      \"feels_like\": 5.86,\n" +
            "      \"pressure\": 1017,\n" +
            "      \"humidity\": 71,\n" +
            "      \"dew_point\": 4.02,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 0,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 2.51,\n" +
            "      \"wind_deg\": 301,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607817600,\n" +
            "      \"temp\": 7.57,\n" +
            "      \"feels_like\": 4.58,\n" +
            "      \"pressure\": 1018,\n" +
            "      \"humidity\": 74,\n" +
            "      \"dew_point\": 3.29,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 0,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 2.18,\n" +
            "      \"wind_deg\": 309,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607821200,\n" +
            "      \"temp\": 6.82,\n" +
            "      \"feels_like\": 4.21,\n" +
            "      \"pressure\": 1019,\n" +
            "      \"humidity\": 76,\n" +
            "      \"dew_point\": 2.94,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 0,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 1.55,\n" +
            "      \"wind_deg\": 320,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607824800,\n" +
            "      \"temp\": 6.32,\n" +
            "      \"feels_like\": 3.96,\n" +
            "      \"pressure\": 1019,\n" +
            "      \"humidity\": 77,\n" +
            "      \"dew_point\": 2.66,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 0,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 1.13,\n" +
            "      \"wind_deg\": 320,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607828400,\n" +
            "      \"temp\": 5.97,\n" +
            "      \"feels_like\": 3.68,\n" +
            "      \"pressure\": 1019,\n" +
            "      \"humidity\": 77,\n" +
            "      \"dew_point\": 2.42,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 0,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 0.94,\n" +
            "      \"wind_deg\": 350,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607832000,\n" +
            "      \"temp\": 5.7,\n" +
            "      \"feels_like\": 3.18,\n" +
            "      \"pressure\": 1019,\n" +
            "      \"humidity\": 78,\n" +
            "      \"dew_point\": 2.33,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 0,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 1.25,\n" +
            "      \"wind_deg\": 14,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607835600,\n" +
            "      \"temp\": 5.32,\n" +
            "      \"feels_like\": 2.27,\n" +
            "      \"pressure\": 1019,\n" +
            "      \"humidity\": 81,\n" +
            "      \"dew_point\": 2.48,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 0,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 2.05,\n" +
            "      \"wind_deg\": 31,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607839200,\n" +
            "      \"temp\": 4.9,\n" +
            "      \"feels_like\": 1.66,\n" +
            "      \"pressure\": 1019,\n" +
            "      \"humidity\": 85,\n" +
            "      \"dew_point\": 2.74,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 0,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 2.38,\n" +
            "      \"wind_deg\": 48,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 800,\n" +
            "          \"main\": \"Clear\",\n" +
            "          \"description\": \"clear sky\",\n" +
            "          \"icon\": \"01n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607842800,\n" +
            "      \"temp\": 4.65,\n" +
            "      \"feels_like\": 1.65,\n" +
            "      \"pressure\": 1019,\n" +
            "      \"humidity\": 88,\n" +
            "      \"dew_point\": 2.95,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 96,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 2.1,\n" +
            "      \"wind_deg\": 49,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 804,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"overcast clouds\",\n" +
            "          \"icon\": \"04n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607846400,\n" +
            "      \"temp\": 4.47,\n" +
            "      \"feels_like\": 1.12,\n" +
            "      \"pressure\": 1019,\n" +
            "      \"humidity\": 90,\n" +
            "      \"dew_point\": 3.08,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 93,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 2.63,\n" +
            "      \"wind_deg\": 55,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 804,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"overcast clouds\",\n" +
            "          \"icon\": \"04n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607850000,\n" +
            "      \"temp\": 4.07,\n" +
            "      \"feels_like\": 0.43,\n" +
            "      \"pressure\": 1018,\n" +
            "      \"humidity\": 92,\n" +
            "      \"dew_point\": 2.98,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 67,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.03,\n" +
            "      \"wind_deg\": 57,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 803,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"broken clouds\",\n" +
            "          \"icon\": \"04n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607853600,\n" +
            "      \"temp\": 3.96,\n" +
            "      \"feels_like\": 0.06,\n" +
            "      \"pressure\": 1018,\n" +
            "      \"humidity\": 91,\n" +
            "      \"dew_point\": 2.72,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 51,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.34,\n" +
            "      \"wind_deg\": 63,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 803,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"broken clouds\",\n" +
            "          \"icon\": \"04n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607857200,\n" +
            "      \"temp\": 4.06,\n" +
            "      \"feels_like\": -0.34,\n" +
            "      \"pressure\": 1018,\n" +
            "      \"humidity\": 89,\n" +
            "      \"dew_point\": 2.42,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 41,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 4,\n" +
            "      \"wind_deg\": 66,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 802,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"scattered clouds\",\n" +
            "          \"icon\": \"03n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607860800,\n" +
            "      \"temp\": 5.64,\n" +
            "      \"feels_like\": 0.73,\n" +
            "      \"pressure\": 1018,\n" +
            "      \"humidity\": 80,\n" +
            "      \"dew_point\": 2.61,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 50,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 4.73,\n" +
            "      \"wind_deg\": 71,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 802,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"scattered clouds\",\n" +
            "          \"icon\": \"03n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607864400,\n" +
            "      \"temp\": 5.66,\n" +
            "      \"feels_like\": 1.43,\n" +
            "      \"pressure\": 1018,\n" +
            "      \"humidity\": 81,\n" +
            "      \"dew_point\": 2.72,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 85,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.81,\n" +
            "      \"wind_deg\": 83,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 804,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"overcast clouds\",\n" +
            "          \"icon\": \"04n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607868000,\n" +
            "      \"temp\": 6.06,\n" +
            "      \"feels_like\": 1.41,\n" +
            "      \"pressure\": 1018,\n" +
            "      \"humidity\": 80,\n" +
            "      \"dew_point\": 2.98,\n" +
            "      \"uvi\": 0.04,\n" +
            "      \"clouds\": 90,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 4.47,\n" +
            "      \"wind_deg\": 91,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 804,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"overcast clouds\",\n" +
            "          \"icon\": \"04d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607871600,\n" +
            "      \"temp\": 6.6,\n" +
            "      \"feels_like\": 2.31,\n" +
            "      \"pressure\": 1018,\n" +
            "      \"humidity\": 79,\n" +
            "      \"dew_point\": 3.34,\n" +
            "      \"uvi\": 0.18,\n" +
            "      \"clouds\": 92,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 4.04,\n" +
            "      \"wind_deg\": 93,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 804,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"overcast clouds\",\n" +
            "          \"icon\": \"04d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607875200,\n" +
            "      \"temp\": 7.48,\n" +
            "      \"feels_like\": 4.41,\n" +
            "      \"pressure\": 1018,\n" +
            "      \"humidity\": 79,\n" +
            "      \"dew_point\": 4.09,\n" +
            "      \"uvi\": 0.19,\n" +
            "      \"clouds\": 94,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 2.52,\n" +
            "      \"wind_deg\": 132,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 804,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"overcast clouds\",\n" +
            "          \"icon\": \"04d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607878800,\n" +
            "      \"temp\": 7.45,\n" +
            "      \"feels_like\": 3.37,\n" +
            "      \"pressure\": 1017,\n" +
            "      \"humidity\": 83,\n" +
            "      \"dew_point\": 4.76,\n" +
            "      \"uvi\": 0.3,\n" +
            "      \"clouds\": 95,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 4.15,\n" +
            "      \"wind_deg\": 99,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 500,\n" +
            "          \"main\": \"Rain\",\n" +
            "          \"description\": \"light rain\",\n" +
            "          \"icon\": \"10d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0.63,\n" +
            "      \"rain\": {\n" +
            "        \"1h\": 0.54\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607882400,\n" +
            "      \"temp\": 7.27,\n" +
            "      \"feels_like\": 2.05,\n" +
            "      \"pressure\": 1016,\n" +
            "      \"humidity\": 88,\n" +
            "      \"dew_point\": 5.49,\n" +
            "      \"uvi\": 0.37,\n" +
            "      \"clouds\": 96,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 5.97,\n" +
            "      \"wind_deg\": 96,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 500,\n" +
            "          \"main\": \"Rain\",\n" +
            "          \"description\": \"light rain\",\n" +
            "          \"icon\": \"10d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0.92,\n" +
            "      \"rain\": {\n" +
            "        \"1h\": 0.44\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607886000,\n" +
            "      \"temp\": 7.88,\n" +
            "      \"feels_like\": 5.13,\n" +
            "      \"pressure\": 1015,\n" +
            "      \"humidity\": 92,\n" +
            "      \"dew_point\": 6.79,\n" +
            "      \"uvi\": 0.37,\n" +
            "      \"clouds\": 100,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 2.82,\n" +
            "      \"wind_deg\": 12,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 501,\n" +
            "          \"main\": \"Rain\",\n" +
            "          \"description\": \"moderate rain\",\n" +
            "          \"icon\": \"10d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 1,\n" +
            "      \"rain\": {\n" +
            "        \"1h\": 3.64\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607889600,\n" +
            "      \"temp\": 7.62,\n" +
            "      \"feels_like\": 4.43,\n" +
            "      \"pressure\": 1014,\n" +
            "      \"humidity\": 96,\n" +
            "      \"dew_point\": 7.1,\n" +
            "      \"uvi\": 0.27,\n" +
            "      \"clouds\": 100,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.57,\n" +
            "      \"wind_deg\": 19,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 501,\n" +
            "          \"main\": \"Rain\",\n" +
            "          \"description\": \"moderate rain\",\n" +
            "          \"icon\": \"10d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 1,\n" +
            "      \"rain\": {\n" +
            "        \"1h\": 3.56\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607893200,\n" +
            "      \"temp\": 7.28,\n" +
            "      \"feels_like\": 3.68,\n" +
            "      \"pressure\": 1014,\n" +
            "      \"humidity\": 96,\n" +
            "      \"dew_point\": 6.77,\n" +
            "      \"uvi\": 0.15,\n" +
            "      \"clouds\": 100,\n" +
            "      \"visibility\": 6319,\n" +
            "      \"wind_speed\": 4.05,\n" +
            "      \"wind_deg\": 1,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 502,\n" +
            "          \"main\": \"Rain\",\n" +
            "          \"description\": \"heavy intensity rain\",\n" +
            "          \"icon\": \"10d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 1,\n" +
            "      \"rain\": {\n" +
            "        \"1h\": 4.62\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607896800,\n" +
            "      \"temp\": 7.29,\n" +
            "      \"feels_like\": 2.86,\n" +
            "      \"pressure\": 1015,\n" +
            "      \"humidity\": 95,\n" +
            "      \"dew_point\": 6.61,\n" +
            "      \"uvi\": 0.03,\n" +
            "      \"clouds\": 100,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 5.19,\n" +
            "      \"wind_deg\": 62,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 501,\n" +
            "          \"main\": \"Rain\",\n" +
            "          \"description\": \"moderate rain\",\n" +
            "          \"icon\": \"10d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 1,\n" +
            "      \"rain\": {\n" +
            "        \"1h\": 1.44\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607900400,\n" +
            "      \"temp\": 6.89,\n" +
            "      \"feels_like\": 3,\n" +
            "      \"pressure\": 1015,\n" +
            "      \"humidity\": 95,\n" +
            "      \"dew_point\": 6.26,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 100,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 4.29,\n" +
            "      \"wind_deg\": 15,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 501,\n" +
            "          \"main\": \"Rain\",\n" +
            "          \"description\": \"moderate rain\",\n" +
            "          \"icon\": \"10d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 1,\n" +
            "      \"rain\": {\n" +
            "        \"1h\": 1.21\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607904000,\n" +
            "      \"temp\": 6.81,\n" +
            "      \"feels_like\": 2.8,\n" +
            "      \"pressure\": 1017,\n" +
            "      \"humidity\": 95,\n" +
            "      \"dew_point\": 6.13,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 100,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 4.44,\n" +
            "      \"wind_deg\": 14,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 500,\n" +
            "          \"main\": \"Rain\",\n" +
            "          \"description\": \"light rain\",\n" +
            "          \"icon\": \"10n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 1,\n" +
            "      \"rain\": {\n" +
            "        \"1h\": 0.72\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607907600,\n" +
            "      \"temp\": 6.9,\n" +
            "      \"feels_like\": 3.22,\n" +
            "      \"pressure\": 1018,\n" +
            "      \"humidity\": 95,\n" +
            "      \"dew_point\": 6.16,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 100,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 4,\n" +
            "      \"wind_deg\": 351,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 500,\n" +
            "          \"main\": \"Rain\",\n" +
            "          \"description\": \"light rain\",\n" +
            "          \"icon\": \"10n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0.67,\n" +
            "      \"rain\": {\n" +
            "        \"1h\": 0.24\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607911200,\n" +
            "      \"temp\": 6.58,\n" +
            "      \"feels_like\": 2.18,\n" +
            "      \"pressure\": 1019,\n" +
            "      \"humidity\": 93,\n" +
            "      \"dew_point\": 5.67,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 100,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 4.84,\n" +
            "      \"wind_deg\": 340,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 500,\n" +
            "          \"main\": \"Rain\",\n" +
            "          \"description\": \"light rain\",\n" +
            "          \"icon\": \"10n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0.71,\n" +
            "      \"rain\": {\n" +
            "        \"1h\": 0.29\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607914800,\n" +
            "      \"temp\": 5.89,\n" +
            "      \"feels_like\": 0.21,\n" +
            "      \"pressure\": 1020,\n" +
            "      \"humidity\": 91,\n" +
            "      \"dew_point\": 4.68,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 100,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 6.38,\n" +
            "      \"wind_deg\": 336,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 500,\n" +
            "          \"main\": \"Rain\",\n" +
            "          \"description\": \"light rain\",\n" +
            "          \"icon\": \"10n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0.7,\n" +
            "      \"rain\": {\n" +
            "        \"1h\": 0.11\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607918400,\n" +
            "      \"temp\": 5.6,\n" +
            "      \"feels_like\": 1.12,\n" +
            "      \"pressure\": 1021,\n" +
            "      \"humidity\": 90,\n" +
            "      \"dew_point\": 4.18,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 100,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 4.54,\n" +
            "      \"wind_deg\": 1,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 804,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"overcast clouds\",\n" +
            "          \"icon\": \"04n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0.66\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607922000,\n" +
            "      \"temp\": 4.38,\n" +
            "      \"feels_like\": 0.75,\n" +
            "      \"pressure\": 1021,\n" +
            "      \"humidity\": 93,\n" +
            "      \"dew_point\": 3.5,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 86,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.13,\n" +
            "      \"wind_deg\": 327,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 804,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"overcast clouds\",\n" +
            "          \"icon\": \"04n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0.62\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607925600,\n" +
            "      \"temp\": 4.82,\n" +
            "      \"feels_like\": 0.18,\n" +
            "      \"pressure\": 1022,\n" +
            "      \"humidity\": 91,\n" +
            "      \"dew_point\": 3.53,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 82,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 4.6,\n" +
            "      \"wind_deg\": 316,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 803,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"broken clouds\",\n" +
            "          \"icon\": \"04n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0.5\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607929200,\n" +
            "      \"temp\": 4.9,\n" +
            "      \"feels_like\": -0.19,\n" +
            "      \"pressure\": 1022,\n" +
            "      \"humidity\": 87,\n" +
            "      \"dew_point\": 2.96,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 96,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 5.11,\n" +
            "      \"wind_deg\": 330,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 804,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"overcast clouds\",\n" +
            "          \"icon\": \"04n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607932800,\n" +
            "      \"temp\": 4.52,\n" +
            "      \"feels_like\": -0.44,\n" +
            "      \"pressure\": 1023,\n" +
            "      \"humidity\": 86,\n" +
            "      \"dew_point\": 2.41,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 98,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 4.79,\n" +
            "      \"wind_deg\": 332,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 804,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"overcast clouds\",\n" +
            "          \"icon\": \"04n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607936400,\n" +
            "      \"temp\": 3.92,\n" +
            "      \"feels_like\": -1.09,\n" +
            "      \"pressure\": 1023,\n" +
            "      \"humidity\": 86,\n" +
            "      \"dew_point\": 1.94,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 96,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 4.72,\n" +
            "      \"wind_deg\": 332,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 804,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"overcast clouds\",\n" +
            "          \"icon\": \"04n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607940000,\n" +
            "      \"temp\": 3.49,\n" +
            "      \"feels_like\": -1.23,\n" +
            "      \"pressure\": 1024,\n" +
            "      \"humidity\": 87,\n" +
            "      \"dew_point\": 1.57,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 94,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 4.24,\n" +
            "      \"wind_deg\": 350,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 804,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"overcast clouds\",\n" +
            "          \"icon\": \"04n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607943600,\n" +
            "      \"temp\": 3.08,\n" +
            "      \"feels_like\": -1.33,\n" +
            "      \"pressure\": 1024,\n" +
            "      \"humidity\": 88,\n" +
            "      \"dew_point\": 1.35,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 88,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.74,\n" +
            "      \"wind_deg\": 355,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 804,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"overcast clouds\",\n" +
            "          \"icon\": \"04n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607947200,\n" +
            "      \"temp\": 3.05,\n" +
            "      \"feels_like\": -1.03,\n" +
            "      \"pressure\": 1024,\n" +
            "      \"humidity\": 88,\n" +
            "      \"dew_point\": 1.35,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 86,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.27,\n" +
            "      \"wind_deg\": 358,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 804,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"overcast clouds\",\n" +
            "          \"icon\": \"04n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607950800,\n" +
            "      \"temp\": 2.04,\n" +
            "      \"feels_like\": -1.99,\n" +
            "      \"pressure\": 1025,\n" +
            "      \"humidity\": 91,\n" +
            "      \"dew_point\": 0.8,\n" +
            "      \"uvi\": 0,\n" +
            "      \"clouds\": 35,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.07,\n" +
            "      \"wind_deg\": 347,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 802,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"scattered clouds\",\n" +
            "          \"icon\": \"03n\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607954400,\n" +
            "      \"temp\": 1.99,\n" +
            "      \"feels_like\": -2.09,\n" +
            "      \"pressure\": 1026,\n" +
            "      \"humidity\": 90,\n" +
            "      \"dew_point\": 0.64,\n" +
            "      \"uvi\": 0.14,\n" +
            "      \"clouds\": 23,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.1,\n" +
            "      \"wind_deg\": 356,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 801,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"few clouds\",\n" +
            "          \"icon\": \"02d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    },\n" +
            "    {\n" +
            "      \"dt\": 1607958000,\n" +
            "      \"temp\": 3.49,\n" +
            "      \"feels_like\": -0.8,\n" +
            "      \"pressure\": 1026,\n" +
            "      \"humidity\": 82,\n" +
            "      \"dew_point\": 0.8,\n" +
            "      \"uvi\": 0.6,\n" +
            "      \"clouds\": 15,\n" +
            "      \"visibility\": 10000,\n" +
            "      \"wind_speed\": 3.44,\n" +
            "      \"wind_deg\": 19,\n" +
            "      \"weather\": [\n" +
            "        {\n" +
            "          \"id\": 801,\n" +
            "          \"main\": \"Clouds\",\n" +
            "          \"description\": \"few clouds\",\n" +
            "          \"icon\": \"02d\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"pop\": 0\n" +
            "    }\n" +
            "  ]\n" +
            "}\n";
}
