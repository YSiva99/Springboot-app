package org.virtusa.app;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.virtusa.app.controllers.MyController;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootDemoApplication.class, args);
		MyController controller=context.getBean("myController",MyController.class);
		controller.great();
		
		
		
	}

}
