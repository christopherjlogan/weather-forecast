package clogan.weatherforecast.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import clogan.weatherforecast.domain.StationList;

@Service
public class NOAARegionService implements RegionService {

	private StationService stationService;

	@Override
	public StationList getRegionList() {
		return this.stationService.getStationList();
	}

	@Autowired
	public void setStationService(StationService stationService) {
		this.stationService = stationService;
	}

}
