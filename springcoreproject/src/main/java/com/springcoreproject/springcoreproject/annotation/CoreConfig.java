package com.springcoreproject.springcoreproject.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcoreproject.springcoreproject.annotation")
public class CoreConfig {

	// @Bean annotation tells to spring - hey spring take this object and keep with
	// you anytime anyone can ask for this object
	@Bean
	public Bean1 getBean1() {
		// creating a new bean object and returning...
		Bean1 bean1 = new Bean1();
		return bean1;
	}

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"samosa","sam"})
	public Bean1 getSamosaPrice() {
		Bean1 bean1 = new Bean1(getSamosa());
		return bean1;
	}

	

}
