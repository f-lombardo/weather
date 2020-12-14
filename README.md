# Weather data API example 

This program uses is an API service that uses the OpenWeather API ( https://openweathermap.org/api ) to retrieve the weather forecast and,
given a city, provides the following information for the next 3 days:
● average maximum/minimum temperatures and humidity during the working hours;
● average maximum/minimum temperatures and humidity outside the working hours.

It uses https://opencagedata.com/ in order to translate the name of a city in its latitude and longitude.

## Configuration
To run the application and the tests, rename file `config/application.properties.sample` in `config/application.properties` and add there your API keys. 

## API documentation
If you are running the app on localhost:8080, use this URL:

http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config

