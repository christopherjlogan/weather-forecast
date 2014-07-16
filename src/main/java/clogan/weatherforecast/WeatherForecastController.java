package clogan.weatherforecast;

import org.apache.log4j.Logger;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import clogan.weatherforecast.beans.ForecastService;
import clogan.weatherforecast.beans.RegionService;
import clogan.weatherforecast.domain.Forecast;
import clogan.weatherforecast.domain.Region;

@RestController
public class WeatherForecastController {
	
	private Logger logger = Logger.getLogger(WeatherForecastController.class);
	private RegionService regionService = null;
	private ForecastService forecastService = null;
	
	@RequestMapping("/regions")
	public ArrayList<Region> getRegions() {
		/*ArrayList<Region> regionList = new ArrayList<Region>();
		regionList.add(new Region("FL"));
		regionList.add(new Region("MA"));*/
		logger.debug("Received request for regions");
		return this.regionService.getRegionList();
	}
	
	@RequestMapping("/forecast")
	public Forecast getCityForecast(@RequestParam(value="city", required=true) String city) {
		logger.debug("Received request for forecast:" + city);
		return new Forecast("Orlando", 98.6);
	}
	
	@Autowired
	public void setForecastService(ForecastService forecastService) {
		logger.debug("ForecastService is set");
		this.forecastService = forecastService;
	}
	
	@Autowired
	public void setRegionService(RegionService regionService) {
		logger.debug("RegionService is set");
		this.regionService = regionService;
	}

}
