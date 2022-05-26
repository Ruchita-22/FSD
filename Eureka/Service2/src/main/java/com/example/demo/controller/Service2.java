package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("TestService2")
public class Service2 {

	@GetMapping
	public String display1() {
		return "Test Service 2";
	}
}
