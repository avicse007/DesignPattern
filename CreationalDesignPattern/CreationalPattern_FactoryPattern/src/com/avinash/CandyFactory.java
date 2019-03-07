package com.avinash;

import java.util.ArrayList;

abstract public class CandyFactory {
	
	abstract public Candy getCandy(String type);

	public ArrayList<Candy> getCandyPackage(int quantity,String type){
		Candy candy = getCandy(type);
		ArrayList<Candy> candyPackage = candy.makeCandyPackage(quantity);
		return candyPackage;
		
	}

}
