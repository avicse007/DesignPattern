package com.avinash;

public class MainClass {
	public static void main(String[] args) {
		BedRoomDirector director = new BedRoomDirector();
		BedRoomBuilder builder = new BedRoomBuilder();
		BedRoom bedRoom = director.createBedRoom(builder);
		System.out.println(bedRoom);
	}	
}
