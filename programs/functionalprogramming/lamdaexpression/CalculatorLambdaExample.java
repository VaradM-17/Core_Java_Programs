package com.programs.functionalprogramming.lamdaexpression;

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

	public static int calculate(int a, int b, Calculator calc) {
		return calc.calculate(a, b);
	}

	public static void main(String[] args) {
		// Without lambda
//		Calculator add = new Addition();
//		System.out.println(add.calculate(14, 15));

		// With lambda
//		Calculator addition = (a, b) -> a + b;
//		System.out.println(addition.calculate(14, 15));

		// Pass lambda as parameter
		System.out.println(calculate(10, 20, (a, b) -> a + b));
	}
}
