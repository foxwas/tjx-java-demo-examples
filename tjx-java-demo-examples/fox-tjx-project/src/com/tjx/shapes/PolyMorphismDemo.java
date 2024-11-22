package com.tjx.shapes;

import java.util.Scanner;

public class PolyMorphismDemo {

	public static void main(String[] args) {
		
		System.out.println( "main begins");
		Shape shape = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your shape: ");
		
		String shapeName = scanner.nextLine();
		
		if(shapeName.equalsIgnoreCase("rectangle")) {
			shape = new Rectangle(2.0, 4.0);
		}
		else if(shapeName.equalsIgnoreCase("circle")) {
			shape = new Circle(3.0);
		}
		else {
			shape = null;
		}
		
		System.out.println("The area is " + shape.calculateArea()); //shape's polymorphism
		System.out.println("main ends");
		
		scanner.close();
	}

}
