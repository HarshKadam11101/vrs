package com.Sprint1.VehicleRenting.service;

import java.time.LocalDateTime;

import com.Sprint1.VehicleRenting.entity.Booking;
import com.Sprint1.VehicleRenting.entity.Customer;
import com.Sprint1.VehicleRenting.entity.Vehicle;

public interface BookingService {

	void insertBooking(Booking Booking);

	void updateBooking(Booking Booking);

	void deleteBooking(int bookingId);

	Booking createBooking(LocalDateTime pickupTime, LocalDateTime returnTime, Vehicle vehicle, Customer customer);

	float calculatefare(int customerId);

	int getNumberOfBooking(int customerId);

}
