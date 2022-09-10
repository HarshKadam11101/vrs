package com.Sprint1.VehicleRenting.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sprint1.VehicleRenting.entity.Brand;
import com.Sprint1.VehicleRenting.entity.Location;
import com.Sprint1.VehicleRenting.repository.LocationRepository;
import com.Sprint1.VehicleRenting.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	LocationRepository locationRepository;
	
	@Override
	public void insertLocation(Location Location) {
		locationRepository.save(Location);
	}
	@Override
	public void updateLocation(Location Location) {
		locationRepository.save(Location);
	}
	@Override
	public void deleteLocation(int locationId) {
		locationRepository.deleteById(locationId);
	}
	
	@Override
	public List<Location> viewLocation(String area){
		List<Location> locationList = locationRepository.findAll();
		if(area.equals("All")) {
			return locationList;
		}
		locationList = locationList.stream().filter(Location -> Location.getArea().equals(area)).collect(Collectors.toList());
		return locationList;
	}
	@Override
	public List<Integer> numberOfLocation() {
		List<Integer> count = new ArrayList();
		String[] area = new String[] {"Mallad", "Andheri", "Juhu", "Airoli"};
		
		for(String Location:area) {
			count.add(viewLocation(Location).size());
		}
		return count;
	}

}
