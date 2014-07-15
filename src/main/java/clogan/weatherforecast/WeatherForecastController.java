package clogan.weatherforecast;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import clogan.weatherforecast.domain.Forecast;
import clogan.weatherforecast.domain.Region;

@RestController
public class WeatherForecastController {
	
	@RequestMapping("/regions")
	public ArrayList<Region> getRegions() {
		ArrayList<Region> regionList = new ArrayList<Region>();
		regionList.add(new Region("FL"));
		regionList.add(new Region("MA"));
		return regionList;
	}
	
	@RequestMapping("/forecast")
	public Forecast getCityForecast(@RequestParam(value="city", required=true) String city) {
		return new Forecast("Orlando", 98.6);
	}

}
