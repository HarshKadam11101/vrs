package com.Sprint1.VehicleRenting.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


	@Entity
	@Table(name = "vehicle")
	public class Vehicle implements Serializable{
		
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="vehicle_id")
		private int vehicleId;
		
		@Column(name="vehicle_name")
		private String vehicleName;
		
		@ManyToOne(targetEntity = Brand.class)
		private Brand brandName;
		
		
		@ManyToOne(targetEntity = Location.class)
		private Location area;
		
		
		@Column(name="vehicle_number")
		private String vehicleNumber;
		
		@Column(name="rent_per_day")
		private int rent;

		
		
		public Vehicle(int vehicleId, String vehicleName, Brand brandName, Location area, String vehicleNumber,
				int rent) {
			super();
			this.vehicleId = vehicleId;
			this.vehicleName = vehicleName;
			this.brandName = brandName;
			this.area = area;
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

		public Brand getBrandName() {
			return brandName;
		}

		public void setBrandName(Brand brandName) {
			this.brandName = brandName;
		}

		public Location getArea() {
			return area;
		}

		public void setArea(Location area) {
			this.area = area;
		}

		public String getVehicleNumber() {
			return vehicleNumber;
		}

		public void setVehicleNumber(String vehicleNumber) {
			this.vehicleNumber = vehicleNumber;
		}

		public int getRent() {
			return rent;
		}

		public void setRent(int rent) {
			this.rent = rent;
		}
		
		

}
