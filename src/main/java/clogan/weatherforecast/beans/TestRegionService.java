package clogan.weatherforecast.beans;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import clogan.weatherforecast.domain.Region;
import clogan.weatherforecast.domain.StationList;

public class TestRegionService implements RegionService {

	@Override
	public StationList getRegionList() {
		ArrayList<Region> regionList = new ArrayList<Region>();
		regionList.add(new Region("KMCO"));
		regionList.add(new Region("KMIA"));
		StationList stationList = new StationList();
		stationList.setStations(regionList);
		return stationList;
	}

}
