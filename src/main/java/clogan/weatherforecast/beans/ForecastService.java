package clogan.weatherforecast.beans;

import clogan.weatherforecast.domain.Forecast;

public interface ForecastService {
	
	public Forecast getForecast(String city);

}
