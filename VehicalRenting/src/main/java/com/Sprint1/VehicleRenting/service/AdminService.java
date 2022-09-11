package com.Sprint1.VehicleRenting.service;

import java.time.LocalDateTime;
import java.util.List;

import com.Sprint1.VehicleRenting.entity.Admin;
import com.Sprint1.VehicleRenting.entity.Booking;

public interface AdminService {

	void insertAdmin(Admin admin);

	void updateAdmin(Admin admin);

	void deleteAdmin(int adminId);

	List<Admin> viewAdmin();

	boolean validateAdmin(String username, String password, String role);

	List<Booking> getAllBooking();

	List<Booking> getBookingsVehiclewise(String vehicleName);

	List<Booking> getBookingsCustomerwise(String userName);

	List<Booking> getAllBookingsForDays(LocalDateTime pickupTime, LocalDateTime returnTime);

	List<Booking> getBookingsLocationwise(String area);

	Admin viewAdmin(int adminId);

	Admin viewAdmin(String username);

}
