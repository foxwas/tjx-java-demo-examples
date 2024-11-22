package com.tjx.shapes;

public class Circle extends Shape {
	
	private Double radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Circle(Double radius) {
		super();
		this.radius = radius;
	}



	@Override
	public double calculateArea() {
		System.out.println("Circle calculateArea() is called");
		return Math.PI * this.radius * this.radius;
	}



	public Double getRadius() {
		return radius;
	}



	public void setRadius(Double radius) {
		this.radius = radius;
	}



	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	

}
