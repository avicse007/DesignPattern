package com.avinash;

import java.util.ArrayList;

public class WhiteChocolateCandy extends Candy{

	@Override
	ArrayList<Candy> makeCandyPackage(int quantity) {
		ArrayList<Candy> packageCandy = new ArrayList<Candy>();
		for(int i=0;i<quantity;i++) {
			WhiteChocolateCandy ch = new WhiteChocolateCandy();
			packageCandy.add(ch);
		}
		System.out.println("Created a package of "+quantity +"White ChocolateCandy");
		return packageCandy;
	}

}
