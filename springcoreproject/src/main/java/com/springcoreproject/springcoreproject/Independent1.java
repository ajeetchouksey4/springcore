package com.springcoreproject.springcoreproject;

public class Independent1 {
	private int id;
	private String name;

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

	public Independent1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Independent1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Independent1 [id=" + id + ", name=" + name + "]";
	}

}
