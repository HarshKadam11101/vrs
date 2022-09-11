package com.Sprint1.VehicleRenting.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Sprint1.VehicleRenting.entity.Customer;
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
	
	@GetMapping("/login")
	public ModelAndView loginPage() {
		if(userId!=0) {
			return null;
		}
		return new ModelAndView("login");
	}
	
	@GetMapping("/register")
	public ModelAndView registerPage() {
		if(userId!=0) {
			return null;
		}
		return new ModelAndView("register");
	}

	public ModelAndView registerPage(String message) {
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("message", message);
		return mav;
	}
	
	@PostMapping("/saveCustomer")
	public ModelAndView saveCustomer(HttpServletRequest request) {
		if(userId!=0) {
			return null;
		}
		ModelAndView mav = new ModelAndView("home");
		String username = (String)request.getParameter("username");
		String PAN = (String)request.getParameter("pan");
		String address = (String)request.getParameter("address");
		String mobileNumber = (String)request.getParameter("mobileNumber");
		String email = (String)request.getParameter("email");
		String password1 = (String)request.getParameter("password1");
		String password2 = (String)request.getParameter("password2");
		if(!password1.equals(password2)) {
			return registerPage("Passwords don't match");
		}
		String message = userServiceImpl.validatePassword(password1);
		if(message!=null) {
			return registerPage(message);
		}
		if(!userServiceImpl.validateMobileNo(mobileNumber)) {
			return registerPage("Invalid mobile number");
		}
		Customer customer = new Customer(username,PAN,password1,address,mobileNumber,email);
		customerServiceImpl.insertCustomer(customer);
		return mav;
		
	}
}
