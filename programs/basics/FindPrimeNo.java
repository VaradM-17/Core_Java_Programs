package com.programs.basics;

import java.util.Scanner;

public class FindPrimeNo {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int userInput = sc.nextInt();

			int cnt = 0;
			for (int i = 1; i <= userInput; i++) {
				if (userInput % i == 0)
					cnt++;
			}
			if (cnt == 2)
				System.out.println("Given number " + userInput + " is prime.");
			else
				System.out.println("Given number " + userInput + " is not prime.");

			sc.close();
		}
	}
}
