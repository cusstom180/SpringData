package com.example.demo.model;

public class Circle {
	
	
	private int id;
	
	public Circle() {
		
	}
	private String name;
	
	public Circle(int id, String name) {
		this.setId(id);
		this.setName(name);
	}
	
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
	
	
	
}