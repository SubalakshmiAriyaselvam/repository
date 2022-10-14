package com.example.cloud;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/")
	public String home() {
		return "welcome to an Application on Cloud (AWS) !";
	}

}
