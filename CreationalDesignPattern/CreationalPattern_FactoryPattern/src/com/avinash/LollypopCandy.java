package com.avinash;

import java.util.ArrayList;

public class LollypopCandy extends Candy{

	@Override
	ArrayList<Candy> makeCandyPackage(int quantity) {
		ArrayList<Candy> packageCandy = new ArrayList<Candy>();
		for(int i=0;i<quantity;i++) {
			LollypopCandy ch = new LollypopCandy();
			packageCandy.add(ch);
		}
		System.out.println("Created a package of "+quantity +" LollypopCandy");
		return packageCandy;
	}

}
