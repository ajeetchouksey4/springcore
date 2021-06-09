package com.springcoreproject.springcoreproject;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Autowiring implements Serializable {

	public static final long serialVersionUID = -134243525245L;
	@Autowired
	private Independent1 ind;

	@Autowired
	private Employee emp;

	public Independent1 getInd() {
		return ind;
	}

	public void setInd(Independent1 ind) {
		this.ind = ind;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Autowiring(Independent1 ind, Employee emp) {
		super();
		this.ind = ind;
		this.emp = emp;
	}

	public Autowiring() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Autowiring [ind=" + ind + ", emp=" + emp + "]";
	}

}
