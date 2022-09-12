package com.Sprint1.VehicleRenting.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Sprint1.VehicleRenting.entity.Admin;
import com.Sprint1.VehicleRenting.entity.Brand;
import com.Sprint1.VehicleRenting.entity.Customer;
import com.Sprint1.VehicleRenting.entity.Location;
import com.Sprint1.VehicleRenting.entity.Vehicle;
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
	private String userRole ="";
	
	
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
	
	@PostMapping("/customerLog")
	public ModelAndView customerLog(HttpServletRequest request) {
		if(!userRole.equals("customer")) {
			return null;
		}
		ModelAndView mav = new ModelAndView("customerLog");
		String PickupTime = (String)request.getParameter("PickupTime");
		String ReturnTime = (String)request.getParameter("ReturnTime");
		String vehicleName = (String)request.getParameter("vehicleName");
		
		
		mav.addObject("PickupTime",PickupTime);
		mav.addObject("ReturnTime",ReturnTime);
		mav.addObject("username",customerServiceImpl.viewCustomer(userId).getUsername());
		return mav;
	}
	
	@PostMapping("/adminHome")
	public ModelAndView adminHome() {
		if(!userRole.equals("admin")) {
			return null;
		}
		ModelAndView mav = new ModelAndView("adminHome");
		mav.addObject("username",adminServiceImpl.viewAdmin(userId).getUsername());
		return mav;
	}
	
	@PostMapping("/sign")
	public ModelAndView signIn(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("message","Incorrect username or password");
		String password;
		try {
			password = request.getParameter("password");			
		}catch(Exception e) {
			return null;
		}
		String username = request.getParameter("username");
		String role = request.getParameter("type");
		if(adminServiceImpl.validateAdmin(username, password, role)) {
			userId = adminServiceImpl.viewAdmin(username).getId();
			userRole = "admin";
			return adminHome();
		}
		else if(customerServiceImpl.validateCustomer(username, password, role)) {
			userId = customerServiceImpl.viewCustomer(username).getId();
			userRole = "customer";
			return bookingPage();
		}
		
		return mav;
	}
	
	@GetMapping("/book")
	public ModelAndView bookingPage() {
		if(!userRole.equals("customer")) {
			return null;
		}
		ModelAndView mav = new ModelAndView("book");
		if(userServiceImpl.viewUser(userId) instanceof Admin) {
			return adminHome();
		}
		
		mav.addObject("username",customerServiceImpl.viewCustomer(userId).getUsername());
		List<Location> locationList = locationServiceImpl.getAllCity();
		mav.addObject("locationList", locationList);
		return mav;
	}
	
	@GetMapping("/vehicleManagement")
	public ModelAndView vehicleManagement() {
		if(!userRole.equals("admin")) {
			return null;
		}
		ModelAndView mav =new ModelAndView("vehicleManagement");
		mav.addObject("userName",adminServiceImpl.viewAdmin(userId).getUsername());
		//mav.addObject("count",vehicleServiceImpl.numberOfVehicle());
		return mav;
	}
	
	@PostMapping("/addAdmin")
	public void insertAdmin (@RequestBody Admin admin) {
		adminServiceImpl.insertAdmin(admin);
//		if(saved.equals("Admin saved successfully")) {
//			return new ResponseEntity<String>(HttpStatus.CREATED);
//		}
//		return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/addCustomer")
	public void insertCustomer (@RequestBody Customer customer) {
		 customerServiceImpl.insertCustomer(customer);
//		if(saved.equals("Admin saved successfully")) {
//			return new ResponseEntity<String>(HttpStatus.CREATED);
//		}
//		return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/addLocation")
	public void insertLocation (@RequestBody Location location) {
		 locationServiceImpl.insertLocation(location);
	}
	
	@PostMapping("/addBrand")
	public void insertBrand (@RequestBody Brand brand) {
		 brandServiceImpl.insertBrand(brand);
	}
	
	@PostMapping("/addVehicle")
	public ResponseEntity<String> insertVehicle (@RequestBody Vehicle vehicle) {
		Vehicle saved = vehicleServiceImpl.saveVehicle(vehicle);
		if(saved.equals("Vehicle saved successfully")) {
			return new ResponseEntity<String>(HttpStatus.CREATED);
		}
		return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/vehicleList")
	public Vehicle getAllVehicle() {
		return (Vehicle) vehicleServiceImpl.getAllVehicle();
	}
	
	@PutMapping("/updateAdmin")
	public void updateAdmin(@RequestBody Admin admin) {
		adminServiceImpl.updateAdmin(admin);
	}
	
	@PutMapping("/updateCustomer")
	public void updateCustomer(@RequestBody Customer customer) {
		customerServiceImpl.updateCustomer(customer);
	}
	
	@PutMapping("/updateLocation")
	public void updateLocation(@RequestBody Location location) {
		locationServiceImpl.updateLocation(location);
	}
	
	@PutMapping("/updateBrand")
	public void updateBrand(@RequestBody Brand brand) {
		brandServiceImpl.updateBrand(brand);
	}
	
	@PutMapping("/updateVehicle")
	public void updateVehicle(@RequestBody Vehicle vehicle) {
		vehicleServiceImpl.updateVehicle(vehicle);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCustomerbyId(@PathVariable("id") int customerId) {
		customerServiceImpl.deleteCustomer(customerId);
	}
	
	@DeleteMapping("/deleteAdmin/{id}")
	public void deleteAdminbyId(@PathVariable("id") int adminId) {
		adminServiceImpl.deleteAdmin(adminId);
	}
	
	@DeleteMapping("/deleteLocation/{id}")
	public void deleteLocationbyId(@PathVariable("id") int locationId) {
		locationServiceImpl.deleteLocation(locationId);
	}
	
	
}
