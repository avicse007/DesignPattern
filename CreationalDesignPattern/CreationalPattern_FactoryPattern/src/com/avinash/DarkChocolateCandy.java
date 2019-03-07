package com.avinash;

import java.util.ArrayList;

public class DarkChocolateCandy extends Candy{

	@Override
	ArrayList<Candy> makeCandyPackage(int quantity) {
		ArrayList<Candy> packageCandy = new ArrayList<Candy>();
		for(int i=0;i<quantity;i++) {
			DarkChocolateCandy ch = new DarkChocolateCandy();
			packageCandy.add(ch);
		}
		System.out.println("Created a package of "+quantity +" Dark ChocolateCandy");
		return packageCandy;
	}

}
