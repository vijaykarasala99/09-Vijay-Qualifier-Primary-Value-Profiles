package com.vijaystack.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@Value("${app.message}")
	private String message;

//	@GetMapping("/msg")
//	public String msg() {
//		return message;
//	}

	@GetMapping("/msg")
	public String msg(String message) {
	    return this.message;
	}
	
}
