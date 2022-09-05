package com.Sprint1.VehicleRenting.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sprint1.VehicleRenting.entity.User;
import com.Sprint1.VehicleRenting.repository.UserRepository;
import com.Sprint1.VehicleRenting.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		User userEntity=new User();
		userEntity.setUserId(user.getUserId());
		userEntity.setUsername(user.getUsername());
		userEntity.setPassword(user.getPassword());
		userEntity.setAddress(user.getAddress());
		userEntity.setEmail(user.getEmail());
		userEntity.setMobileNumber(user.getMobileNumber());
		userRepository.save(userEntity);
		return user;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

}
