package com.Sprint1.VehicleRenting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sprint1.VehicleRenting.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	

}
