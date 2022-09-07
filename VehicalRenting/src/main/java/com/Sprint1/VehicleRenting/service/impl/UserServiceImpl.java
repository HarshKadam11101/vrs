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
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUser(Integer userId) {
		return userRepository.findById(userId).get();
	}



}
