package com.corejava.functionalprogramming;

interface Calculator {
	int calculate(int a, int b);
}

//class Addition implements Calculator {
//
//	@Override
//	public int calculate(int a, int b) {
//		return a + b;
//	}
//}

public class CalculatorLambdaExample {
	public static void main(String[] args) {
//		Calculator add = new Addition();
//		System.out.println(add.calculate(14, 15));

		Calculator addition = (a, b) -> a + b;
		System.out.println(addition.calculate(14, 15));
	}
}
