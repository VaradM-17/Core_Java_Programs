package com.programs.basics;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a1 = 0;
		int a2 = 1;

		System.out.print(a1 + ", " + a2);
		for (int i = 2; i < num; i++) {
			int a3 = a1 + a2;
			System.out.print(", " + a3);
			a1 = a2;
			a2 = a3;
		}
		System.out.println(".");
		sc.close();
	}
}
