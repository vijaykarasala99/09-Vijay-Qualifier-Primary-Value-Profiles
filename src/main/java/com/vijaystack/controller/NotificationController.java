package com.vijaystack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vijaystack.service.NotificationService;

@RestController
public class NotificationController {
	
	// @Primary → EmailNotificationService
	@Autowired
	private NotificationService notificationService;

	// @Qualifier → SmsNotificationService
	@Autowired
	@Qualifier("smsNotificationService")
	private NotificationService smsService;

	// @Value → application.properties
	@Value("${vijay.message}")
	private String appMessage;

	@GetMapping("/primary")
	public String primary(@RequestParam(defaultValue = "Hello") String message) {
		return notificationService.send(message);
	}

	@GetMapping("/qualifier")
	public String qualifier(@RequestParam(defaultValue = "Hello") String message) {
		return smsService.send(message);
	}

	@GetMapping("/value")
	public String value() {
		return appMessage;
	}
}