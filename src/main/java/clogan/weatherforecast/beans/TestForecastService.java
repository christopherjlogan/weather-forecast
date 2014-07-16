package clogan.weatherforecast.beans;

import org.springframework.stereotype.Service;

import clogan.weatherforecast.domain.Forecast;

@Service
public class TestForecastService implements ForecastService {

	@Override
	public Forecast getForecast(String city) {
		return new Forecast("Orlando", 98.6);
	}

}
