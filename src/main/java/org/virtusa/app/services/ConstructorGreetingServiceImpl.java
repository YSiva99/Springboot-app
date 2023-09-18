package org.virtusa.app.services;

import org.springframework.stereotype.Service;

@Service("constructorGreeting")
public class ConstructorGreetingServiceImpl implements GreetingService {

	@Override
	public String greet() {
		
		return "Constructor greeting:Hello! Good Morning";
	}
	

}
