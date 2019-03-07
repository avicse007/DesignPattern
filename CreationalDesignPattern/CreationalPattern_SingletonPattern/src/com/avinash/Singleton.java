package com.avinash;
/*
public final class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized(Singleton.class) {
			instance = new Singleton();
			}
		}
		return instance;
	}
}
*/
/*
other option
*/

public final class Singleton {
	
	public static final Singleton instance=new Singleton();
	
	private Singleton() {
		
	}
}
