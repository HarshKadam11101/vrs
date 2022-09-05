package com.Sprint1.VehicleRenting.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Sprint1.VehicleRenting.entity.User;
@Service
public interface UserService {
	
List<User> getAllUsers();
	
	User saveUser(User user);
	User updateUser(User user);

	void deleteUser(int id);

}
