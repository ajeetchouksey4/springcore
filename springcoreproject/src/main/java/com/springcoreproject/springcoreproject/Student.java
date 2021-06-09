package com.springcoreproject.springcoreproject;

import java.util.List;
import java.util.Map;

public class Student {
	private int studentId;
	private String studentName;
	private List<String> address;
	private Map<Integer, String> studentData;
	private College clg;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Map<Integer, String> getStudentData() {
		return studentData;
	}
	public void setStudentData(Map<Integer, String> studentData) {
		this.studentData = studentData;
	}
	public College getClg() {
		return clg;
	}
	public void setClg(College clg) {
		this.clg = clg;
	}
	
	
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public Student(int studentId, String studentName, Map<Integer, String> studentData) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentData = studentData;
	}
	
	
	
	public Student(int studentId, String studentName, List<String> address, Map<Integer, String> studentData) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.studentData = studentData;
	}
	public Student(int studentId, String studentName, List<String> address, Map<Integer, String> studentData,
			College clg) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.studentData = studentData;
		this.clg = clg;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address
				+ ", studentData=" + studentData + ", clg=" + clg + "]";
	}
	
	
	public void init() {
		System.out.println("Student - Init Method called");
	}
	
	public void destroy() {
		System.out.println("Student - Destroy Method called");
	}

}
