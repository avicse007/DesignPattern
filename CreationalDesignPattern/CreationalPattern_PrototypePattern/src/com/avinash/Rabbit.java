package com.avinash;

public class Rabbit implements Cloneable {
	
	enum Breed{
		HIMALAYAN,
		AFFRICAN,
		AMERICAN,
		DUTCH
	}
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(String ownername) {
		this.owner = new Person(ownername);
	}

	private int age;
	private Breed breed;
	private Person owner;
	
	public Rabbit() {
		
	}
	
	@Override
	public Rabbit clone() {
		try {
			Rabbit rabbit= (Rabbit) super.clone();
			rabbit.owner=owner.clone();
			return rabbit;
		}catch(CloneNotSupportedException ex) {
			throw new AssertionError();
		}
	}
	
	@Override
	public String toString() {
		
		return " Name "+this.name+"\n Age "+this.age+"\n Breed "+this.breed+
				"\n Owner "+this.getOwner().getName();
	}
}
