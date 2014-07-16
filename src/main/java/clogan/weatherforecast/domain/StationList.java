package clogan.weatherforecast.domain;

import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="wx_station_index")
@XmlAccessorType (XmlAccessType.FIELD)
public class StationList {
	
	@XmlElement(name="station")
	private ArrayList<Region> stations = null;
	private HashMap<String, String> forecastUrlMap = new HashMap<String, String>();
	
	public ArrayList<Region> getStations() {
		return this.stations;
	}
	
	public void setStations(ArrayList<Region> stations) {
		this.stations = stations;
	}
	
	public String getStationForecastUrl(String stationName) {
		for(Region region : stations) {
			forecastUrlMap.put(region.getName(), region.getXmlUrl());
		}
		return this.forecastUrlMap.get(stationName);
	}
	
}
