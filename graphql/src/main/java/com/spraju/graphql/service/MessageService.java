package com.spraju.graphql.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	private String message="Hi Sarath";
	
	public String getMessage() {
		return message;
	}
	
}
