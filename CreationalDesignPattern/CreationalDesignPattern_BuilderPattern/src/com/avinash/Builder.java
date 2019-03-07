package com.avinash;

public interface Builder {

	Builder setHeight(int height);

	Builder setWidth(int width);

	Builder setFloorNumber(int floorNumber);

	Builder setWallColor(String wallColor);

	Builder setNumberOfWindows(int numberOfWindows);

	Builder setNumberOfDoors(int numberOfDoors);
	
	BedRoom build();

}