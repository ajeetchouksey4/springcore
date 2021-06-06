package com.springcore;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		// Employee emp = context.getBean("emp2",Employee.class);

		Employee emp = context.getBean("emp1",Employee.class);
		System.out.println(emp);

		context.registerShutdownHook();
	
	}
}
