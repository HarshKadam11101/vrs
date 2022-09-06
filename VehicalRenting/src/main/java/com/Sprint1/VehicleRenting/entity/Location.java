package com.Sprint1.VehicleRenting.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Location")
public class Location implements Serializable{
	
		
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="location_id")
		private int locationid;
		
		@Column(name="city")
		private String city;
		
		@Column(name="area")
		private String area;
	
		public Location() {}
		
		public Location(String city, String area) {
			this.area= area;
			this.city= city;
			
		}

		public int getLocationid() {
			return locationid;
		}

		public void setLocationid(int locationid) {
			this.locationid = locationid;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getArea() {
			return area;
		}

		public void setArea(String area) {
			this.area = area;
		}
		
		
		
	 
	 
	
	
	

}
