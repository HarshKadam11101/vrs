package com.Sprint1.VehicleRenting.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sprint1.VehicleRenting.entity.Brand;
import com.Sprint1.VehicleRenting.entity.Vehicle;
import com.Sprint1.VehicleRenting.repository.BrandRepository;
import com.Sprint1.VehicleRenting.repository.VehicleRepository;
import com.Sprint1.VehicleRenting.service.BrandService;
import com.Sprint1.VehicleRenting.service.VehicleService;


@Service
public class VehicleServiceImpl implements VehicleService{
	
	
	@Autowired
	VehicleRepository vehicleRepository;

	@Override
	public List<Vehicle> getAllVehicle() {
		// TODO Auto-generated method stub
		List<Vehicle> vehicleList=vehicleRepository.findAll();
		
		return vehicleList;
	}

//	@Override
//	public Brand getVehicle(long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
		Vehicle vehicleEntity=new Vehicle();
		vehicleEntity.setVehicleId(vehicle.getVehicleId());
		vehicleEntity.setVehicleName(vehicle.getVehicleName());
		vehicleEntity.setVehicleNumber(vehicle.getVehicleNumber());
		vehicleEntity.setBrandName(vehicle.getBrandName());
		vehicleEntity.setArea(vehicle.getArea());
		vehicleEntity.setRent(vehicle.getRent());
		
		vehicleRepository.save(vehicleEntity);
		return vehicle;
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteVehicle(int vehicleId) {
		
		// TODO Auto-generated method stub
		vehicleRepository.deleteById(vehicleId);
	
	}
	@Override
	
	
	public List<Vehicle> viewVehicle(String vehicleName){
		List<Vehicle> vehicleList = vehicleRepository.findAll();
		if(vehicleName.equals("All")) {
			return vehicleList;
		}
		vehicleList = vehicleList.stream().filter(vehicle -> vehicle.getVehicleName().equals(vehicleName)).collect(Collectors.toList());
		return vehicleList;
	}

	@Override
	public Vehicle getVehicle(int vehilcleId) {
		// TODO Auto-generated method stub
		return null;
	}

	
		
		
		
	}