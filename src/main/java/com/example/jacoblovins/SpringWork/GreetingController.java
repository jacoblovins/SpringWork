package com.example.jacoblovins.SpringWork;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/greeting")
	public String getGreeting() {
		return "Hello from SpringWork! Checking the gitignore file.";  
	}
}