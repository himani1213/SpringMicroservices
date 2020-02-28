package com.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"default","spanish"})
public class HelloWorldServiceSpanishImpl implements HelloWorldService{

	@Override
	public String getGreeting() {
		return "Hola Mundo!!";
	}
}
