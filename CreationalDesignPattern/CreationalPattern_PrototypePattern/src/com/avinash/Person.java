package com.avinash;

public class Person implements Cloneable {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public Person clone() {
		try {
			return (Person) super.clone();
		}catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
}