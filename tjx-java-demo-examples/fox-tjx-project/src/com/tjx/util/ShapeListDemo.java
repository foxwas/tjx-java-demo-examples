package com.tjx.util;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.tjx.shapes.Circle;
import com.tjx.shapes.Rectangle;
import com.tjx.shapes.Shape;

public class ShapeListDemo {

	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(new Rectangle(2.0, 4.0));
		shapes.add(new Rectangle(12.0,10.0));
		shapes.add(new Circle(10.0));
		
		System.out.println(shapes);
		for (Shape shape : shapes) {
			System.out.println(shape.calculateArea());
		}
		
		System.out.println();
		ListIterator<Shape> listShapes = shapes.listIterator();
		while(listShapes.hasNext()) {
			Shape s = listShapes.next();
			
			System.out.println(s.calculateArea());
		}

	}

}
