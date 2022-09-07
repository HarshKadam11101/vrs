package com.Sprint1.VehicleRenting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sprint1.VehicleRenting.entity.User;
import com.Sprint1.VehicleRenting.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/saveuser")
	public User saveUser(@RequestBody User user)
	{
		return userService.saveUser(user);
	}
	
	@GetMapping("/getuser/{id}")
	public User getUser(@PathVariable("id") Integer userId) {
		return userService.getUser(userId);
		
	}

}
