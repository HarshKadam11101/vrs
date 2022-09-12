package com.Sprint1.VehicleRenting.serviceImpl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sprint1.VehicleRenting.entity.Admin;
import com.Sprint1.VehicleRenting.entity.Booking;
import com.Sprint1.VehicleRenting.entity.Customer;
import com.Sprint1.VehicleRenting.entity.Location;
import com.Sprint1.VehicleRenting.entity.User;
import com.Sprint1.VehicleRenting.entity.Vehicle;
import com.Sprint1.VehicleRenting.repository.AdminRepository;
import com.Sprint1.VehicleRenting.repository.BookingRepository;
import com.Sprint1.VehicleRenting.repository.BrandRepository;
import com.Sprint1.VehicleRenting.repository.CustomerRepository;
import com.Sprint1.VehicleRenting.repository.LocationRepository;
import com.Sprint1.VehicleRenting.repository.VehicleRepository;
import com.Sprint1.VehicleRenting.service.AdminService;
import com.Sprint1.VehicleRenting.service.CustomerService;

@Service

public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository repository;
	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	BrandRepository brandRepository;
	@Autowired
	VehicleRepository vehicleRepository;
	@Autowired
	LocationRepository locationRepository;
	@Override
	public void insertAdmin(Admin admin) {
//		
//		Admin admin1=new Admin();
//		admin1.setId(admin.getId());
//		admin1.setUsername(admin.getUsername());
//		admin1.setPAN(admin.getPAN());
		//admin
//		vehicleEntity.setVehicleNumber(vehicle.getVehicleNumber());
//		vehicleEntity.setBrand(vehicle.getBrand());
//		vehicleEntity.setLocation(vehicle.getLocation());
//		vehicleEntity.setRent(vehicle.getRent());
		
//		vehicleRepository.save(vehicleEntity);
//		return vehicle;
		repository.save(admin);
		//return admin;
		
	}
	@Override
	public void updateAdmin(Admin admin) {
		repository.save(admin);
	}
	@Override
	public void deleteAdmin(int adminId) {
		repository.deleteById(adminId);
	}
	@Override
	public List<Admin> viewAdmin(){
		List<Admin> allAdmin = (List<Admin>) repository.findAll();
		return allAdmin;
	}
	
	@Override
	public Admin viewAdmin(int adminId){
		List<Admin> adminList = repository.findAll();
		for(Admin admin:adminList) {
			if(admin.getId()==adminId) {
				return admin;
			}
		}
		return null;
	}
	
	@Override
	public Admin viewAdmin(String username){
		List<Admin> adminList = repository.findAll();
		for(Admin admin:adminList) {
			if(admin.getUsername().equals(username) || admin.getEmail().equals(username)) {
				return admin;
			}
		}
		return null;
	}

	@Override
	public boolean validateAdmin(String username, String password,String role) {
		if(role.equals("A")) {
			List<Admin> adminList = repository.findAll();
			for(Admin admin:adminList) {
				if(admin.getEmail().equalsIgnoreCase(username) || admin.getUsername().equalsIgnoreCase(username)) {
					if(admin.getPassword().equals(password)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	@Override
	public List<Booking> getAllBooking(){
		List<Booking> bookingList = bookingRepository.findAll();
		return bookingList;
	}
	
	@Override
	public List<Booking> getBookingsVehiclewise(String vehicleName) {
		List<Vehicle> vehicleList = vehicleRepository.findAll();
		for(Vehicle vehicle:vehicleList) {
			if(vehicle.getVehicleName().equalsIgnoreCase(vehicleName)) {
				List<Booking> bookingList=bookingRepository.findAll();
				bookingList = bookingList.stream().filter(booking -> (booking.getVehicle()).getVehicleName().equalsIgnoreCase(vehicleName)).collect(Collectors.toList());
				return bookingList;
			}
		}
		return new ArrayList<>();
	}
	@Override
	public List<Booking> getBookingsCustomerwise(String userName) {
		List<Customer> customerList = customerRepository.findAll();
		for(Customer customer:customerList) {
			if(customer.getUsername().equalsIgnoreCase(userName)) {
				List<Booking> bookingList=bookingRepository.findAll();
				bookingList = bookingList.stream().filter(booking -> booking.getCustomer().getUsername().equalsIgnoreCase(userName)).collect(Collectors.toList());
				return bookingList;
			}
		}
		return new ArrayList<>();
		
	}
	@Override
	public List<Booking> getAllBookingsForDays(LocalDateTime pickupTime, LocalDateTime returnTime) {
		List<Booking> bookingList=bookingRepository.findAll();
		bookingList = bookingList.stream().filter(booking -> booking.getPickupTime().isAfter(pickupTime) && booking.getReturnTime().isBefore(returnTime)).collect(Collectors.toList());
		return bookingList;
	}
	@Override
	public List<Booking> getBookingsLocationwise(String area) {
		List<Location> areaList = locationRepository.findAll();
		for(Location location:areaList) {
			if(location.getArea().equalsIgnoreCase(area)) {
				List<Booking> bookingList=bookingRepository.findAll();
				bookingList = bookingList.stream().filter(booking -> booking.getLocation().getArea().equalsIgnoreCase(area)).collect(Collectors.toList());
				return bookingList;
			}
		}
	return new ArrayList<>();
	}
	
	
}
	


