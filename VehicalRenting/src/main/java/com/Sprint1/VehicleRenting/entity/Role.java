package com.Sprint1.VehicleRenting.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Roles")
public class Role  {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String role;
    
    
	public Integer getId() {
		return id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Role(Integer id, String role) {
		this.id = id;
		this.role = role;
	}

	public Role() {
	
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + "]";
	}
	
	
	
}
