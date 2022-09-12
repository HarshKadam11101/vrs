package com.Sprint1.VehicleRenting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sprint1.VehicleRenting.entity.Admin;
import com.Sprint1.VehicleRenting.entity.Brand;
import com.Sprint1.VehicleRenting.entity.Customer;
import com.Sprint1.VehicleRenting.entity.Location;
import com.Sprint1.VehicleRenting.entity.Vehicle;
import com.Sprint1.VehicleRenting.serviceImpl.AdminServiceImpl;
import com.Sprint1.VehicleRenting.serviceImpl.BrandServiceImpl;
import com.Sprint1.VehicleRenting.serviceImpl.CustomerServiceImpl;
import com.Sprint1.VehicleRenting.serviceImpl.LocationServiceImpl;
import com.Sprint1.VehicleRenting.serviceImpl.VehicleServiceImpl;

@RestController
public class DatabaseController {
	
	@Autowired
	AdminServiceImpl adminServiceImpl;
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	@Autowired
	VehicleServiceImpl vehicleServiceImpl;
	@Autowired
	BrandServiceImpl brandServiceImpl;
	@Autowired
	LocationServiceImpl locationServiceImpl;
	@GetMapping("/postData")
	
	public void postData() {
		
		postAdmin();
		postCustomer();
		//postLocation();
		//postBrand();
		postVehicle();
			
	}
	
	
	@GetMapping("/postAdmin")
	
	public void postAdmin() {
		Admin admin1 = new Admin("Suresh","AV67890","Suresh123","MG Road","9048342481","Suresh@gmail.com");
		Admin admin2 = new Admin("Ramesh","BN67890","Ramesh123","GT Road","9058882481","Ramesh@gmail.com");
		
		adminServiceImpl.insertAdmin(admin1);
		adminServiceImpl.insertAdmin(admin2);
		
	}
	
	@GetMapping("/postCustomer")
	
	public void postCustomer() {
		Customer customer1 = new Customer("Ravi","CD67890","ravi123","EE Road","9044562481","ravi@gmail.com");
		Customer customer2 = new Customer("Joy","VB67890","joy123","DD Road","9222882481","joy@gmail.com");
		
		customerServiceImpl.insertCustomer(customer1);
		customerServiceImpl.insertCustomer(customer2);
	}
	
//	@GetMapping("/postLocation")
//	
//	public void postLocation() {
//		Location location1 = new Location("Mumbai","Airoli");
//		Location location2 = new Location("Kolkata","Dum Dum");
//		
//		locationServiceImpl.insertLocation(location1);
//		locationServiceImpl.insertLocation(location2);
//		
//	}
//	
//	@GetMapping("/postBrand")
//	
//	public void postBrand() {
//		Brand brand1 = new Brand("Renault",2016);
//		Brand brand2 = new Brand("Toyota",2020);
//		
//		brandServiceImpl.insertBrand(brand1);
//		brandServiceImpl.insertBrand(brand2);
//	}
	
	@GetMapping("/postVehicle")
	
	public Vehicle postVehicle() {
		Brand brand1 = new Brand("Renault",2016);
		Brand brand2 = new Brand("Toyota",2020);
		
		brandServiceImpl.insertBrand(brand1);
		brandServiceImpl.insertBrand(brand2);
		
		Location location1 = new Location("Mumbai","Airoli");
		Location location2 = new Location("Kolkata","Dum Dum");
		
		locationServiceImpl.insertLocation(location1);
		locationServiceImpl.insertLocation(location2);
		
	
		Vehicle vehicle1 = new Vehicle("Duster",brand1,location1,"MH09BJ2552",500);
		Vehicle vehicle2 = new Vehicle("Innova",brand2,location2,"WB09BJ2442",400);
		
		//vehicleServiceImpl.saveVehicle(vehicle1);
		return vehicleServiceImpl.saveVehicle(vehicle1);
		//return vehicleServiceImpl.saveVehicle(vehicle2);
		
	}
	
	
	

}
