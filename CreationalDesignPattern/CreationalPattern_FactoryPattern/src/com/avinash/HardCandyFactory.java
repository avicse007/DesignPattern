package com.avinash;

public class HardCandyFactory extends CandyFactory{

	@Override
	public Candy getCandy(String type) {
		switch (type) {
		case "Hard":
			return new HardCandy();
		case "lollypop":
			return new  LollypopCandy();
		default:
			return null;
		}
	}

}
