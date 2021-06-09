package com.springcoreproject.springcoreproject;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements Serializable, InitializingBean, DisposableBean {

	/**
	 * 
	 */

	public static final long serialVersionUID = 1490101214909109953L;
	private int empId;
	private String empName;
	private Map<Integer, String> data;
	private List<Integer> address;
	private Set<Integer> phoneNumber;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Map<Integer, String> getData() {
		return data;
	}

	public void setData(Map<Integer, String> data) {
		this.data = data;
	}

	public List<Integer> getAddress() {
		return address;
	}

	public void setAddress(List<Integer> address) {
		this.address = address;
	}

	public Set<Integer> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Set<Integer> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Employee(int empId, String empName, Map<Integer, String> data, List<Integer> address,
			Set<Integer> phoneNumber) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.data = data;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", data=" + data + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	public void destroy() throws Exception {
		System.out.println("Employee - Destroy called");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee - init () After Property set called");
		
	}

}
