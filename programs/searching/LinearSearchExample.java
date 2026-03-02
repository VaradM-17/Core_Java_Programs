package com.programs.searching;

public class LinearSearchExample {
	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40 };
		int findElement = 30;
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == findElement) {
				System.out.println("Element found at index " + i);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Element not found.");
		}

	}
}
