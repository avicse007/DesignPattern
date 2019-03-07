package com.avinash;

public class BedRoomDirector {

	public BedRoom createBedRoom(BedRoomBuilder builder) {
		builder.setDouble(true);
		builder.setFloorNumber(2);
		builder.setHeight(19);
		builder.setNumberOfDoors(2);
		builder.setNumberOfWindows(4);
		builder.setSuite(false);
		builder.setWallColor("White");
		builder.setWidth(20);
		return builder.build();
	}

}
