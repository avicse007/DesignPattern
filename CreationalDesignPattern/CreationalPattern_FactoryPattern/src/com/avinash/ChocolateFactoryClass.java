package com.avinash;

public class ChocolateFactoryClass extends CandyFactory {

	@Override
	public Candy getCandy(String type) {
		switch (type) {
		case "Chocolate":
			return new ChocolateCandy();
		case "White Chocolate":
			return new  WhiteChocolateCandy();
		case "Dark Chocolate":
			return new DarkChocolateCandy();	

		default:
			return null;
		}
	}

}
