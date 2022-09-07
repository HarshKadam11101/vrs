package com.Sprint1.VehicleRenting.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sprint1.VehicleRenting.repository.RoleRepository;
import com.Sprint1.VehicleRenting.repository.UserRepository;
import com.Sprint1.VehicleRenting.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;

}
