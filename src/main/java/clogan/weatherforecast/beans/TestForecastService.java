package clogan.weatherforecast.beans;

import clogan.weatherforecast.domain.Forecast;

public class TestForecastService implements ForecastService {

	@Override
	public Forecast getForecast(String city) {
		return new Forecast("KMCO", "Thunderstorms", "95.0 F (35.0 C)", "Orlando International Airport");
	}

}
