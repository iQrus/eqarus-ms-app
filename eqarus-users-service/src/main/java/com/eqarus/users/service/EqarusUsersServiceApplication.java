package com.eqarus.users.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EqarusUsersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EqarusUsersServiceApplication.class, args);
	}

}
