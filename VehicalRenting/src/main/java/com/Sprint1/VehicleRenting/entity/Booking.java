package com.Sprint1.VehicleRenting.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Booking_id;
	
	@Column (name="Pickup date")
	private LocalDateTime PickupDate;
	
	@Column(name="Return Date")
	private LocalDateTime ReturnDate;
	
	@Column(name="Availability")
	private boolean Availablity;
	
	@OneToOne(targetEntity = Vehicle.class,mappedBy = "Booking")
	private Vehicle vehicle;
	
	@OneToOne(targetEntity = Location.class)
	private Location location;

	public long getBooking_id() {
		return Booking_id;
	}

	public void setBooking_id(int booking_id) {
		Booking_id = booking_id;
	}

	public LocalDateTime getPickupDate() {
		return PickupDate;
	}

	public void setPickupDate(LocalDateTime pickupDate) {
		PickupDate = pickupDate;
	}

	public LocalDateTime getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(LocalDateTime returnDate) {
		ReturnDate = returnDate;
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

	public Booking(long booking_id, LocalDateTime pickupDate, LocalDateTime returnDate, boolean availablity, Vehicle vehicle,
			Location location) {
	
		this.Booking_id = booking_id;
		this.PickupDate = pickupDate;
		this.ReturnDate = returnDate;
		this.Availablity = availablity;
		this.vehicle = vehicle;
		this.location = location;
	}

	public Booking() {
	}

	@Override
	public String toString() {
		return "Booking [Booking_id=" + Booking_id + ", PickupDate=" + PickupDate + ", ReturnDate=" + ReturnDate
				+ ", Availablity=" + Availablity + ", vehicle=" + vehicle + ", location=" + location + "]";
	}
	
	

	
}
