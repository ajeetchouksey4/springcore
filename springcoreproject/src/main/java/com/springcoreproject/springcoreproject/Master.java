package com.springcoreproject.springcoreproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class Master {

	@Autowired
	private static App app;
	
	
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcoreproject/springcoreproject/spring-config.xml");
		context.registerShutdownHook();
		
		System.out.println(app.str);
	}
}
