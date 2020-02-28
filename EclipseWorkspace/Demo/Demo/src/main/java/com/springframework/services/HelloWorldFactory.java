package com.springframework.services;

public class HelloWorldFactory {
	
	public HelloWorldService createHelloWorldService(String language) {
		HelloWorldService helloWorldService = null;
		switch (language) {
		
			case "eng":
				helloWorldService = new HelloWorldServiceEngImpl();
				break;
			case "spanish":
				helloWorldService = new HelloWorldServiceSpanishImpl();
				break;
		}
		return helloWorldService;
	}

}
