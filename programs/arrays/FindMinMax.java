package com.programs.arrays;

import java.util.Scanner;

public class FindMinMax {

	public static int findMax(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	public static int findMin(int arr[]) {

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}

		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter " + size + " numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("\nMax number from the list is " + findMax(arr));
		System.out.println("Min number from the list is " + findMin(arr));
	}
}
