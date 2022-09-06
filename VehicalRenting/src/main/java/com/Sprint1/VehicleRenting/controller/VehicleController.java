package com.Sprint1.VehicleRenting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sprint1.VehicleRenting.entity.Vehicle;
import com.Sprint1.VehicleRenting.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	VehicleService vehicleService;
	
	@GetMapping("/getvehicle")
	public List<Vehicle> getAllVehicle()
	{
		List<Vehicle> vehicles=vehicleService.getAllVehicle();
		return vehicles;
	}
	
	
	@PostMapping("/savevehicle")
	public Vehicle savevehicle(@RequestBody Vehicle vehicle) {
		Vehicle vehicle1=vehicleService.saveVehicle(vehicle);
		return vehicle1;
	}
	
	
	
	

}

