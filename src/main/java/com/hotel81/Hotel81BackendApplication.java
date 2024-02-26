package com.hotel81;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class Hotel81BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hotel81BackendApplication.class, args);
	}

}
