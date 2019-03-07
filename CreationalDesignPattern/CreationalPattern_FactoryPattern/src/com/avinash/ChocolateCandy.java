package com.avinash;

import java.util.ArrayList;

public class ChocolateCandy extends Candy{

	@Override
	ArrayList<Candy> makeCandyPackage(int quantity) {
		ArrayList<Candy> packageCandy = new ArrayList<Candy>();
		for(int i=0;i<quantity;i++) {
			ChocolateCandy ch = new ChocolateCandy();
			packageCandy.add(ch);
		}
		System.out.println("Created a package of "+quantity +" ChocolateCandy");
		return packageCandy;
	}

}
