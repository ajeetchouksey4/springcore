package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employer {
	
	@Autowired
	@Qualifier("personalData2")
	private PersonalData personalData;

	public PersonalData getPersonalData() {
		return personalData;
	}
	
	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}

	
	public Employer(PersonalData personalData) {
		super();
		this.personalData = personalData;
		System.out.println("By Constructor: Employeer");
	}

	public Employer() {
		super();

	}

	@Override
	public String toString() {
		return "Employer [personalData=" + personalData + "]";
	}

}
