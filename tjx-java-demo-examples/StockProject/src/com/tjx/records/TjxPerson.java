package com.tjx.records;

public record TjxPerson(String name, Integer id) implements Runnable{
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.id);
	}

	@Override
	public void run() {
		System.out.println("running");
		
	}

	public String name() {
		return name;
	}

	public Integer id() {
		return id;
	}
	
	
	

}
