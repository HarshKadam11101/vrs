package com.Sprint1.VehicleRenting.service;

import com.Sprint1.VehicleRenting.entity.User;

public interface UserService {
	
 
String validatePassword(String password);


User viewUser(int userId);

boolean validateMobileNo(String mobileNumber);
	


}
