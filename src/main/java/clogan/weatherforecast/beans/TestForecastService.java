package clogan.weatherforecast.beans;

import org.springframework.stereotype.Service;

import clogan.weatherforecast.domain.Forecast;

@Service
public class TestForecastService implements ForecastService {

	@Override
	public Forecast getForecast(String city) {
		return new Forecast("KMCO", "Thunderstorms", "95.0 F (35.0 C)");
	}

}
