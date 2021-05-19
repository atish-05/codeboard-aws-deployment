package com.example.awsec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return "Hi Atish";
		
	}

}
