package com.springcore;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PersonalData implements InitializingBean, DisposableBean {
	private Date dob;
	private String cardNumber;
	private String bankName;
	private String bankBalance;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(String bankBalance) {
		this.bankBalance = bankBalance;
	}

	public PersonalData(Date dob, String cardNumber, String bankName, String bankBalance) {
		super();
		this.dob = dob;
		this.cardNumber = cardNumber;
		this.bankName = bankName;
		this.bankBalance = bankBalance;
	}

	public PersonalData() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PersonalData [dob=" + dob + ", cardNumber=" + cardNumber + ", bankName=" + bankName + ", bankBalance="
				+ bankBalance + "]";
	}

	@Override
	public void destroy() {
		System.out.println("destroy method called - PersonalData.java");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("INIT method called - PersonalData.java");

	}
}
