package com.Sprint1.VehicleRenting.service;

import java.util.List;

import com.Sprint1.VehicleRenting.entity.Vehicle;

public interface VehicleService {
	List<Vehicle> getAllVehicle();
	Vehicle saveVehicle(Vehicle vehicle);
	Vehicle updateVehicle(Vehicle vehicle);
	void deleteVehicle(int vehilcleId);
	List<Vehicle> viewVehicle(String vehicleName);
	//List<Integer> numberOfVehicle();
	//List<Integer> numberOfVehicle(int vehicleId);
	List<Integer> numberOfVehicle();

}


