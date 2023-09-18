package org.virtusa.app.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.virtusa.app.services.GreetingService;

@Controller
public class MyController {
	private GreetingService greetingService;
	
	public MyController(@Qualifier("constructorGreeting") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public void great() 
	{
		System.out.println(greetingService.greet());
		
	}

}
