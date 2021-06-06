package com.springcore;

import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
	private int id;
	private String name;
	private Map<String, String> data;
	private PersonalData personalData;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public PersonalData getPersonalData() {
		return personalData;
	}

	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}

	public Employee(int id, String name, Map<String, String> data, PersonalData personalData) {
		super();
		this.id = id;
		this.name = name;
		this.data = data;
		this.personalData = personalData;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", data=" + data + ", personalData=" + personalData + "]";
	}

	

	@Override
	public void destroy() {
		System.out.println("destroy method called - Employee.java");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("INIT method called - Employee.java");
		
	}
}
