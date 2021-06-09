package com.springcoreproject.springcoreproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ComponenClass {
	@Value("45")
	private int age;
	@Value("101")
	private int id;
	
	@Value("#{myList}")
	private List<String> abc;

	
	
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public List<String> getAbc() {
		return abc;
	}



	public void setAbc(List<String> abc) {
		this.abc = abc;
	}



	@Override
	public String toString() {
		return "ComponenClass [age=" + age + ", id=" + id + ", abc=" + abc + "]";
	}
	
	
	
	

}
