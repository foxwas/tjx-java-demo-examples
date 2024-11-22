package com.tjx.devices;

public interface TjxDataReadable {
	
	
	public static final Integer MAX_SIZE=100000;
	
	public String readStringData();
	public Integer readIntegerData();
	
	public default void saveData() {
		System.out.println("saving to TJX data store");
	}
	

}
