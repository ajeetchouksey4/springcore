package com.springcoreproject.springcoreproject.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcoreproject/springcoreproject/annotation/annotation-config.xml");
		Bean1 bean = context.getBean(Bean1.class);
		System.out.println(bean);
	}
}
