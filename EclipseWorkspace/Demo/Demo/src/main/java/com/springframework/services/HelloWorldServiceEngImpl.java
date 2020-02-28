package com.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("eng")
public class HelloWorldServiceEngImpl implements HelloWorldService{

	@Override
	public String getGreeting() {
		return "Hello World";
	}

}
