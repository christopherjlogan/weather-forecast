package clogan.weatherforecast.domain;

public class Forecast {
	
	private String station;
	private String weather;
	private String temperatureString;
	
	public Forecast() {
		
	}
	
	public Forecast(String station, String weather, String temperatureString) {
		this.station = station;
		this.weather = weather;
		this.temperatureString = temperatureString;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getTemperatureString() {
		return temperatureString;
	}

	public void setTemperatureString(String temperatureString) {
		this.temperatureString = temperatureString;
	}
	
}
