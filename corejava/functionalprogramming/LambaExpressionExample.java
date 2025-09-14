package com.corejava.functionalprogramming;

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
	public static void main(String[] args) {
//		Shape rectangle = new Rectangle();
//		rectangle.draw();
//
//		Shape square = new Square();
//		square.draw();
		Shape rectangle = () -> System.out.println("Rectangle is drawing...");
		rectangle.draw();

		Shape square = () -> System.out.println("Square is drawing...");
		square.draw();
	}
}
