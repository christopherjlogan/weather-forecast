package clogan.weatherforecast.beans;

import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import clogan.weatherforecast.domain.StationList;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class StationListService implements StationService {
	
	private StationList stationList = null;
	private String regionsUrlString = "http://w1.weather.gov/xml/current_obs/index.xml";
	private Logger logger = Logger.getLogger(StationListService.class);

	private StationListService() {
		try {
			StationList stationList;
			JAXBContext jaxbContext = JAXBContext
					.newInstance(StationList.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext
					.createUnmarshaller();
			logger.debug("About to load xml from " + regionsUrlString);
			URL regionsUrl = new URL(regionsUrlString);
			stationList = (StationList) jaxbUnmarshaller
					.unmarshal(regionsUrl);
			this.stationList = stationList;
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	
	@Override
	public StationList getStationList() {
		return this.stationList;
	}

}
