package com.springcoreproject.springcoreproject;

public class College {
	private int collegeCode;
	private String collegeName;
	private String collegeLocation;

	public int getCollegeCode() {
		return collegeCode;
	}

	public void setCollegeCode(int collegeCode) {
		this.collegeCode = collegeCode;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeLocation() {
		return collegeLocation;
	}

	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}

	public College(int collegeCode, String collegeName, String collegeLocation) {
		super();
		this.collegeCode = collegeCode;
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "College [collegeCode=" + collegeCode + ", collegeName=" + collegeName + ", collegeLocation="
				+ collegeLocation + "]";
	}

}
