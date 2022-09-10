package com.Sprint1.VehicleRenting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Sprint1.VehicleRenting.serviceImpl.AdminServiceImpl;
import com.Sprint1.VehicleRenting.serviceImpl.BrandServiceImpl;
import com.Sprint1.VehicleRenting.serviceImpl.CustomerServiceImpl;
import com.Sprint1.VehicleRenting.serviceImpl.LocationServiceImpl;
import com.Sprint1.VehicleRenting.serviceImpl.UserServiceImpl;
import com.Sprint1.VehicleRenting.serviceImpl.VehicleServiceImpl;
//@CrossOrigin
@RestController
public class ApplicationController {
	
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
	@Autowired
	UserServiceImpl userServiceImpl;
	
	
	private int userId = 0;
	
	// Self-Explanatory mapping methods
	
	@GetMapping("/")
	public ModelAndView homePage() {
		if(userId==0) {
			return new ModelAndView("home");
		}
		return null;
	}

}
