package com.avinash;

import com.avinash.Rabbit.Breed;

public class MainClass {

	public static void main(String[] args) {
		Rabbit himalayan = new Rabbit();
		himalayan.setAge(12);
		himalayan.setName("dhanu");
		himalayan.setBreed(Breed.HIMALAYAN);
		himalayan.setOwner("Avinash");
		Rabbit copy = himalayan.clone();
		System.out.println("Himalayan \n"+himalayan);
		System.out.println("COPY \n"+copy);
		copy.setAge(10);
		copy.setName("Copy");
		copy.setBreed(Breed.AMERICAN);
		copy.getOwner().setName("Suraj");
		System.out.println("After changing copy");
		System.out.println("Himalayan \n"+himalayan);
		System.out.println("COPY \n"+copy);
		System.out.println(copy.getOwner().getName());
		System.out.println(himalayan.getOwner().getName());
	}

}
