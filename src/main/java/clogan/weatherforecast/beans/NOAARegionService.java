package clogan.weatherforecast.beans;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import clogan.weatherforecast.domain.Region;
import clogan.weatherforecast.domain.StationList;

@Service
public class NOAARegionService implements RegionService {

	private String regionsUrlString = "http://w1.weather.gov/xml/current_obs/index.xml";
	private String regionUrlFile = "c:/Users/logac018/My Documents/stationlist.xml";
	private Logger logger = Logger.getLogger(NOAARegionService.class);

	@Override
	public StationList getRegionList() {
		StationList stationList = new StationList();
		try {
			JAXBContext jaxbContext = JAXBContext
					.newInstance(StationList.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			logger.debug("About to load xml from " + regionsUrlString);
			URL regionsUrl = new URL(regionsUrlString);
			// stationList = (StationList) jaxbUnmarshaller.unmarshal(new
			// File(regionUrlFile));
			stationList = (StationList) jaxbUnmarshaller.unmarshal(regionsUrl);
		} catch (Exception e) {
			System.out.println("Exception unmarshalling data");
			stationList.setStations(new ArrayList<Region>());
			return stationList;
		}
		return stationList;
	}

}
