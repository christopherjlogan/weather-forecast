package clogan.weatherforecast.beans;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import clogan.weatherforecast.domain.Region;

@Service
public class TestRegionService implements RegionService {

	@Override
	public ArrayList<Region> getRegionList() {
		ArrayList<Region> regionList = new ArrayList<Region>();
		regionList.add(new Region("KMCO"));
		regionList.add(new Region("KMIA"));
		return regionList;
	}

}
