package com.avinash;

public class CandyStore {
	public static final CandyFactory chocolateCandyFactory = new ChocolateFactoryClass();
	public static final CandyFactory hardCandyFactory = new HardCandyFactory();
	public static void main(String[] args) {
		chocolateCandyFactory.getCandyPackage(12, "White Chocolate");
		chocolateCandyFactory.getCandyPackage(10, "Dark Chocolate");
		hardCandyFactory.getCandyPackage(7, "Hard");
		hardCandyFactory.getCandyPackage(5, "lollypop");
		chocolateCandyFactory.getCandyPackage(13, "Chocolate");
		

	}
}
