package com.Sprint1.VehicleRenting.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Booking_id;
	
	@Column (name="Pickup_time")
	private LocalDateTime PickupTime;
	
	@Column(name="Return_time")
	private LocalDateTime ReturnTime;
	
	@Column(name="Availability")
	private boolean Availablity;
	
	@ManyToOne(targetEntity = Vehicle.class)
	private Vehicle vehicle;
	
	@ManyToOne(targetEntity = Location.class)
	private Location location;

	@Column (name= "total_fare")
	private float fare;
	
	@ManyToOne (targetEntity= Customer.class)
	private Customer customer;
	

	public Booking(LocalDateTime pickupTime, LocalDateTime returnTime, Vehicle vehicle, Customer customer) {
	
	//	this.Booking_id = booking_id;
		this.PickupTime = pickupTime;
		this.ReturnTime = returnTime;
		//this.Availablity = availablity;
		this.vehicle = vehicle;
		//this.location = location;
		//this.fare= fare;
		this.customer = customer;
		
	}


	public long getBooking_id() {
		return Booking_id;
	}


	public void setBooking_id(long booking_id) {
		Booking_id = booking_id;
	}


	public LocalDateTime getPickupTime() {
		return PickupTime;
	}


	public void setPickupTime(LocalDateTime pickupTime) {
		PickupTime = pickupTime;
	}


	public LocalDateTime getReturnTime() {
		return ReturnTime;
	}


	public void setReturnTime(LocalDateTime returnTime) {
		ReturnTime = returnTime;
	}


	public boolean isAvailablity() {
		return Availablity;
	}


	public void setAvailablity(boolean availablity) {
		Availablity = availablity;
	}


	public Vehicle getVehicle() {
		return vehicle;
	}


	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public float getFare() {
		return fare;
	}


	public void setFare(float fare) {
		this.fare = fare;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	
	
	
	

	
//
//	@Override
//	public String toString() {
//		return "Booking [Booking_id=" + Booking_id + ", PickupDate=" + PickupTime + ", ReturnDate=" + PickupTime
//				+ ", Availablity=" + Availablity + ", vehicle=" + vehicle + ", location=" + location + "]";
//	}
//	

	
}
