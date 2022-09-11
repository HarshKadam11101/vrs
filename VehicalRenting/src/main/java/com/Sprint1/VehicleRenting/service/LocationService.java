package com.Sprint1.VehicleRenting.service;

import java.util.List;

import com.Sprint1.VehicleRenting.entity.Location;

public interface LocationService  {

	void insertLocation(Location Location);

	void updateLocation(Location Location);

	void deleteLocation(int locationId);

	List<Location> viewLocation(String area);

	List<Integer> numberOfArea();

	List<Location> getAllCity();

}
