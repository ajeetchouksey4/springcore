package com.springcoreproject.springcoreproject.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.ApplicationContext;

public class AnnotationBase {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CoreConfig.class);
		Bean1 obj = context.getBean("sam",Bean1.class);
		obj.study();
	}
}
