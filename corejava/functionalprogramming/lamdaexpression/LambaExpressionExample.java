package com.corejava.functionalprogramming.lamdaexpression;

interface Shape {
	public void draw();
}

//class Rectangle implements Shape {
//
//	@Override
//	public void draw() {
//		System.out.println("Rectangle is drawing...");
//	}
//}
//
//class Square implements Shape {
//
//	@Override
//	public void draw() {
//		System.out.println("Square is drawing...");
//	}
//
//}

public class LambaExpressionExample {
	// pass lambda as parameter
	public static void drawing(Shape shape) {
		shape.draw();
	}

	public static void main(String[] args) {
//		Shape rectangle = new Rectangle();
//		rectangle.draw();
//
//		Shape square = new Square();
//		square.draw();
//
//		Shape rectangle = () -> System.out.println("Rectangle is drawing...");
//		rectangle.draw();
//
//		Shape square = () -> System.out.println("Square is drawing...");
//		square.draw();

//      pass lambda as parameter
//		Shape circle = () -> System.out.println("Drawing circle ...");
//		drawing(circle);

		drawing(() -> System.out.println("Drawing rectangle..."));
		drawing(() -> System.out.println("Drawing circle..."));
		drawing(() -> System.out.println("Drawing square..."));
	}
}
