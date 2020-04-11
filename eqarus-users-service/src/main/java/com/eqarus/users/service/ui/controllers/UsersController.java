package com.eqarus.users.service.ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UsersController {
	
	@Autowired
	Environment env;
	
	@GetMapping
	public String status() {
		return "User service running on port : "+env.getProperty("local.server.port");
	}

}
