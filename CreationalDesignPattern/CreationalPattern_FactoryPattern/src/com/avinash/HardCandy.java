package com.avinash;

import java.util.ArrayList;

public class HardCandy extends Candy{

	@Override
	ArrayList<Candy> makeCandyPackage(int quantity) {
		ArrayList<Candy> packageCandy = new ArrayList<Candy>();
		for(int i=0;i<quantity;i++) {
			HardCandy ch = new HardCandy();
			packageCandy.add(ch);
		}
		System.out.println("Created a package of "+quantity +" Hard Candy");
		return packageCandy;
	}

}
