package com.vijaystack.service;

import org.springframework.stereotype.Service;

@Service
public class SmsNotificationService implements NotificationService{

	@Override
	public String send(String message) {	
		return "SMS notification sent: " + message;
	}

}
