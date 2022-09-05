package com.Sprint1.VehicleRenting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Sprint1.VehicleRenting.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
Optional<User> findByUsername(String name);
	
	Optional<User> findByUserId(int id);

}
