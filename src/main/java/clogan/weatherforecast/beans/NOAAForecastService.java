package clogan.weatherforecast.beans;

import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clogan.weatherforecast.domain.Forecast;
import clogan.weatherforecast.domain.StationList;

@Service
public class NOAAForecastService implements ForecastService {

	private StationService stationService;
	private Logger logger = Logger.getLogger(NOAAForecastService.class);
	
	@Override
	public Forecast getForecast(String city) {
		Forecast forecast = null;
		try {
			StationList stationList = stationService.getStationList();
			String forecastUrlString = stationList.getStationForecastUrl(city);
			URL forecastUrl = new URL(forecastUrlString);
			JAXBContext jaxbContext = JAXBContext
					.newInstance(Forecast.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext
					.createUnmarshaller();
			logger.debug("About to load xml from " + forecastUrl);
			forecast = (Forecast) jaxbUnmarshaller
					.unmarshal(forecastUrl);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return forecast;
	}
	
	@Autowired
	public void setStationService(StationService stationService) {
		this.stationService = stationService;
	}

}
