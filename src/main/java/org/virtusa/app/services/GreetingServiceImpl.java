package org.virtusa.app.services;

import org.springframework.stereotype.Service;

@Service("greetingService")
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String greet() {
		
		return "normal greeting:Good Morning";
	}

}
