package clogan.weatherforecast.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="current_observation")
@XmlAccessorType (XmlAccessType.FIELD)
public class Forecast {
	
	@XmlElement(name="station_id")
	private String station;
	@XmlElement(name="weather")
	private String weather;
	@XmlElement(name="temperature_string")
	private String temperatureString;
	@XmlElement(name="location")
	private String location;

	public Forecast() {
		
	}
	
	public Forecast(String station, String weather, String temperatureString, String location) {
		this.station = station;
		this.weather = weather;
		this.temperatureString = temperatureString;
		this.location = location;
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
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
