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
	
	@Column (name="Pickup_time")
	private LocalDateTime PickupTime;
	
	@Column(name="Return_time")
	private LocalDateTime ReturnTime;
	
	@Column(name="Availability")
	private boolean Availablity;
	
	@OneToOne(targetEntity = Vehicle.class)
	private Vehicle vehicleName;
	
	@OneToOne(targetEntity = Location.class)
	private Location area;

	@Column (name= "total_fare")
	private float fare;
	
	@OneToOne (targetEntity= User.class)
	private User id;
	

	public Booking(long booking_id, LocalDateTime pickupTime, LocalDateTime returnTime, boolean availablity, Vehicle vehicleName,
			Location area, float fare, User id) {
	
		this.Booking_id = booking_id;
		this.PickupTime = pickupTime;
		this.ReturnTime = returnTime;
		this.Availablity = availablity;
		this.vehicleName = vehicleName;
		this.area = area;
		this.fare= fare;
		this.id = id;
		
	}

	public Booking() {
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

	public Vehicle getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(Vehicle vehicleName) {
		this.vehicleName = vehicleName;
	}

	public Location getArea() {
		return area;
	}

	public void setArea(Location area) {
		this.area = area;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	public User getId() {
		return id;
	}

	public void setId(User id) {
		this.id = id;
	}
	
	

	
//
//	@Override
//	public String toString() {
//		return "Booking [Booking_id=" + Booking_id + ", PickupDate=" + PickupTime + ", ReturnDate=" + PickupTime
//				+ ", Availablity=" + Availablity + ", vehicle=" + vehicle + ", location=" + location + "]";
//	}
//	

	
}
