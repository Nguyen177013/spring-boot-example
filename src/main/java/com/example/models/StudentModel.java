package com.example.models;

import java.util.Objects;

public class StudentModel {
	private int id;
	private String name, location;

	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentModel(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

//	This Set/Get segment is require or else will cause error 406 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello " + this.name + ", from " + this.location;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.name, this.location);
	}
}
