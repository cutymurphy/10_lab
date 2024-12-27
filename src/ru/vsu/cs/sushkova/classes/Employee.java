package ru.vsu.cs.sushkova.classes;

public abstract class Employee {

	protected int ssNo;
	protected String name;
	protected String email;
	protected int counter;

	public int getSsNo() {
		return this.ssNo;
	}

	public void setSsNo(int ssNo) {
		this.ssNo = ssNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCounter() {
		return this.counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}