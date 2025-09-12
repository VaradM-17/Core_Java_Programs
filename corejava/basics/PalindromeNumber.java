package com.corejava.basics;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int userInput = sc.nextInt();

		StringBuilder sb = new StringBuilder(String.valueOf(userInput));
		sb.reverse();
		System.out.println(sb.toString());
		if (sb.toString().equals(String.valueOf(userInput)))
			System.out.println("given number is Palindrome.");
		else
			System.out.println("given number is not Palindrome.");

		sc.close();
	}
}
