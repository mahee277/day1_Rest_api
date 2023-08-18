package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiController {

	@GetMapping("Welcome")
	public String Welcome() {
		
		return "Welcome to Spring Boot.";
	}
}
