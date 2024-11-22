package com.tjx.shapes;
//The type Rectangle must implement the inherited abstract method Shape.calculateArea()
public class Rectangle extends Shape {
	
	private Double width;
	private Double height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Rectangle(Double width, Double height) {
		super();
		this.width = width;
		this.height = height;
	}



	@Override
	public double calculateArea() {
		System.out.println("Rectangle calculateArea() is called");
		return this.width * this.height;
	}



	public Double getWidth() {
		return width;
	}



	public void setWidth(Double width) {
		this.width = width;
	}



	public Double getHeight() {
		return height;
	}



	public void setHeight(Double height) {
		this.height = height;
	}
	
	

}
