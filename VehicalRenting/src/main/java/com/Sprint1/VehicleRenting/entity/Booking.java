package com.Sprint1.VehicleRenting.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Transactional
@NoArgsConstructor
@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Booking_id;
	
	@Column (name="Pickup date")
	private Date PickupDate;
	
	@Column(name="Return Date")
	private Date ReturnDate;
	
	@Column(name="Availability")
	private boolean Availablity;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Vehicle vehicle;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Location location;
	

}
