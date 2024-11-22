package com.tjx.shapes;

public abstract class Shape {
	
	private String shapeName;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	@Override
	public String toString() {
		return "Shape [shapeName=" + shapeName + "]";
	}
	
	public abstract double calculateArea();

}
