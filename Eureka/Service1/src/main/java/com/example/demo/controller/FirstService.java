package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TestService1")
public class FirstService {
	
	@GetMapping
	public String display() {
		return "Test Service1";
	}
}
