package com.avinash;

public class BedRoom {

	private int height;
	private int width;
	private int floorNumber;
	private String wallColor;
	private int numberOfWindows;
	private int numberOfDoors;
	private boolean isDouble;
	private boolean isSuite;
	public BedRoom(int height, int width, int floorNumber, String wallColor, int numberOfWindows, int numberOfDoors,
			boolean isDouble, boolean isSuite) {
		super();
		this.height = height;
		this.width = width;
		this.floorNumber = floorNumber;
		this.wallColor = wallColor;
		this.numberOfWindows = numberOfWindows;
		this.numberOfDoors = numberOfDoors;
		this.isDouble = isDouble;
		this.isSuite = isSuite;
	}
	public String toString() {
		return " height :"+this.height+":\n width : "+this.width+":\n floorNumber : "
				+this.floorNumber+":\n numberOfDoors : "+
				this.numberOfDoors+":\n numberOfWindows : "
				+this.numberOfWindows+":\n wallColor : "+
				this.wallColor+":\n width : "+this.width;

	}
	
}
	
