package com.corejava.arrays;

import java.util.Scanner;

public class FindPrimeNoInArray {

	public static boolean isPrime(int num) {
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count == 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.print("Enter " + size + " numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("\nPrime numbers from the list are: ");
		for (int num : arr) {
			if (isPrime(num)) {
				System.out.print(num + " ");
			}
		}
	}
}
