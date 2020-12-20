# Weather data API example 

This program uses is an API service that uses the OpenWeather API ( https://openweathermap.org/api ) to retrieve the weather forecast. 
Given a city, it provides the following data for the next 3 days:
- average/maximum/minimum temperatures and humidity during the working hours;
- average/maximum/minimum temperatures and humidity outside the working hours.

It uses https://opencagedata.com/ in order to translate the name of a city in its latitude and longitude.

## Configuration
First of all, you need to get free API keys from OpenWeather and OpenCage services.
To run the application and the tests, rename file `config/application.properties.sample` in `config/application.properties` and add there your API keys. 

## Run the application
- Open a shell terminal and change your current directory to the root of the project
- Build the application with `mvn clean package`. This will create the jar file  `./target/weather-0.0.1.jar`
- Add your API keys to `config/application.properties`
- For Mac/Linux run `java -jar ./target/weather-0.0.1.jar`
- For Windows run `java -jar target\weather-0.0.1.jar`
- Point your browser to http://localhost:8080/weather?city=ACityName, for example in order to get weather forecats for Rome use http://localhost:8080/weather?city=Rome
- To get information about the API in a Swagger fashion, point your browser at http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config

## API documentation
If you are running the app on localhost:8080, use this URL:

http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config

## Running in Docker

From the root directory of the project, run:

```
docker build -f ./docker/Dockerfile -t weather .
```

This will create the `weather` container. Then

```
docker run -p 8080:8080/tcp -it weather
```

This way you can access service API on http://localhost:8080 
