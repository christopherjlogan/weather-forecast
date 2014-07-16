package clogan.weatherforecast.domain;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="wx_station_index")
@XmlAccessorType (XmlAccessType.FIELD)
public class StationList {
	
	@XmlElement(name="station")
	private ArrayList<Region> stations = null;
	
	public ArrayList<Region> getStations() {
		return this.stations;
	}
	
	public void setStations(ArrayList<Region> stations) {
		this.stations = stations;
	}
	
}
