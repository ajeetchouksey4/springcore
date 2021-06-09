package com.springcoreproject.springcoreproject;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class App {
	@Value("#{myList}")
	public static List<String> str;
	
	public static void main(String[] args) throws Exception {
		System.out.println("Hello World!");

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcoreproject/springcoreproject/spring-config.xml");
		context.registerShutdownHook();
//
//		Teacher emp1 = context.getBean(Teacher.class);
//		System.out.println(emp1.hashCode());
//
//		Teacher emp2 = context.getBean(Teacher.class);
//		System.out.println(emp2.hashCode());
		
		
//		ExpressionParser parser = new SpelExpressionParser();
//		Expression exp = parser.parseExpression("'Hello World'.concat('!')");
//		String message = (String) exp.getValue();
		
		
		System.out.println(str);
	

		
	}
}
