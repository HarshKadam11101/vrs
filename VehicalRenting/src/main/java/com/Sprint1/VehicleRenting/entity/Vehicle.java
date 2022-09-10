package com.Sprint1.VehicleRenting.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


	@Entity
	@Table(name = "Vehicle")
	public class Vehicle implements Serializable{
		
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="vehicle_id")
		private int vehicleId;
		
		@Column(name="vehicle_name")
		private String vehicleName;
		
		@ManyToOne(targetEntity = Brand.class)
		private Brand brand;
		
		@ManyToOne(targetEntity = Location.class)
		private Location location;
		
		@Column(name="vehicle_number")
		private String vehicleNumber;
		
		@Column(name="rent_per_hour")
		private float rent;

		public Vehicle() {}
		
		

		public Vehicle( String vehicleName, Brand brand, Location location, String vehicleNumber,
				int rent) {
			super();
			//this.vehicleId = vehicleId;
			this.vehicleName = vehicleName;
			this.brand = brand;
			this.location = location;
			this.vehicleNumber = vehicleNumber;
			this.rent = rent;
		}

		public int getVehicleId() {
			return vehicleId;
		}

		public void setVehicleId(int vehicleId) {
			this.vehicleId = vehicleId;
		}

		public String getVehicleName() {
			return vehicleName;
		}

		public void setVehicleName(String vehicleName) {
			this.vehicleName = vehicleName;
		}

		

		public Brand getBrand() {
			return brand;
		}



		public void setBrand(Brand brand) {
			this.brand = brand;
		}



		public Location getLocation() {
			return location;
		}



		public void setLocation(Location location) {
			this.location = location;
		}



		public String getVehicleNumber() {
			return vehicleNumber;
		}

		public void setVehicleNumber(String vehicleNumber) {
			this.vehicleNumber = vehicleNumber;
		}



		public float getRent() {
			return rent;
		}



		public void setRent(float rent) {
			this.rent = rent;
		}

		
		
		

}
