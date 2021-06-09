package com.springcoreproject.springcoreproject.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;


public class Bean1 {

	@Value("101")
	private int id;
	@Value("Ajeet Chouksey - 101")
	private String name;

	
	private Samosa samosa;

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

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Bean1(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Bean1(int id, String name, Samosa samosa) {
		super();
		this.id = id;
		this.name = name;
		this.samosa = samosa;
	}

	public Bean1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Bean1 [id=" + id + ", name=" + name + ", samosa=" + samosa + "]";
	}

	public void study() {
		this.samosa.price();
		System.out.println("Bean Studying.....");
	}
}
