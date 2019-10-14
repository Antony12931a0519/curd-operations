package com.training.curdoperations.models;

public class Student {

	private String name;
	private int id;
	private String initial;
	private float marks;

	public String getInitial() {
		return initial;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", initial=" + initial + ", marks="
				+ marks + "]";
	}

}
