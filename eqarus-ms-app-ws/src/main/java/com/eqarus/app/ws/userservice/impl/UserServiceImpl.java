package com.eqarus.app.ws.userservice.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.eqarus.app.ws.ui.model.request.UserRequest;
import com.eqarus.app.ws.ui.model.response.UserRest;
import com.eqarus.app.ws.userservice.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	Map<String, UserRest> users;
	
	@Override
	public UserRest createUser(UserRequest userDetails) {
		UserRest returnValue = new UserRest();
		returnValue.setEmail(userDetails.getEmail());
		returnValue.setFirstName(userDetails.getFirstName());
		returnValue.setLastName(userDetails.getLastName());

		String userId = UUID.randomUUID().toString();
		returnValue.setUserId(userId);
		if (users == null)
			users = new HashMap<>();
		users.put(userId, returnValue);
		
		return returnValue;
	}

}
