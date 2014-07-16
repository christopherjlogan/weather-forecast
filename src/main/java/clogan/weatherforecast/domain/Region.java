package clogan.weatherforecast.domain;

import java.net.URL;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "station")
@XmlAccessorType (XmlAccessType.FIELD)
public class Region {
	
	@XmlElement(name="station_id")
	private String name;
	@XmlElement(name="xml_url")
	private URL xmlUrl;
	
	public Region() {
		
	}
	
	public Region (String name) {
		this.name = name;
	}
	
	public Region (String name, URL xmlUrl) {
		this.name = name;
		this.xmlUrl = xmlUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public URL getXmlUrl() {
		return xmlUrl;
	}

	public void setXmlUrl(URL xmlUrl) {
		this.xmlUrl = xmlUrl;
	}
	
}
