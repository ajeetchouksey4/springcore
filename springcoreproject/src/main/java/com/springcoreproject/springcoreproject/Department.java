package com.springcoreproject.springcoreproject;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Department {
	private String departmentId;

	private String departmentName;

	private Student student;

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Department(String departmentId, String departmentName, Student student) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.student = student;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", student="
				+ student + "]";
	}

	@PostConstruct
	public void init() {
		System.out.println("++++++++++ Department inti called +++++++++++");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("@@@@@@@@@@@@ Department Destroy called @@@@@@@@@@");
	}
	
	

	

	
	
	
}
