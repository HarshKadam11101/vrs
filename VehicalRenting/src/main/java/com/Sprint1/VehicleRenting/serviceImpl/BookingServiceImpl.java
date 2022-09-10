package com.Sprint1.VehicleRenting.serviceImpl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sprint1.VehicleRenting.entity.Booking;
import com.Sprint1.VehicleRenting.entity.Brand;
import com.Sprint1.VehicleRenting.entity.Customer;
import com.Sprint1.VehicleRenting.entity.Vehicle;
import com.Sprint1.VehicleRenting.repository.BookingRepository;
import com.Sprint1.VehicleRenting.repository.VehicleRepository;
import com.Sprint1.VehicleRenting.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	VehicleRepository vehicleRepository;
	
	@Override
	public void insertBooking(Booking Booking) {
		bookingRepository.save(Booking);
	}
	@Override
	public void updateBooking(Booking Booking) {
		bookingRepository.save(Booking);
	}
	@Override
	public void deleteBooking(int bookingId) {
		bookingRepository.deleteById(bookingId);
	}
	@Override
	public Booking createBooking(LocalDateTime pickupTime, LocalDateTime returnTime, Vehicle vehicle, Customer customer) {
	
		Booking booking = new Booking(pickupTime,returnTime,vehicle,customer);
		//booking.setPickupTime(pickupTime);
		//booking.setReturnTime(returnTime);
		float c = returnTime.toEpochSecond(ZoneOffset.of("Z"))- pickupTime.toEpochSecond(ZoneOffset.of("Z"));
		float fare = (c/3600)*vehicle.getRent();
		booking.setFare(fare);
		return booking  ;
		
	}
	@Override
	public float calculatefare(int customerId) {
		
 		List<Booking> bookingList = bookingRepository.findAll();
 		bookingList = bookingList.stream().filter(booking -> booking.getCustomer().getId()== customerId).collect(Collectors.toList());
 		float totalFare = 0;
 		
 		for(Booking booking:bookingList ) {
 			totalFare += booking.getFare();
 			
 		}
		return totalFare;
	}
		@Override
	public int getNumberOfBooking(int customerId) {
		
		List<Booking> bookingList = bookingRepository.findAll();
		
		return (int) bookingList.stream().filter(booking -> booking.getCustomer().getId()== customerId).count();
		
		
	}
		

	

}
