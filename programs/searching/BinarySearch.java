package com.programs.searching;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int element = 60;

		int lowerIndex = 0;
		int higherIndex = arr.length - 1;

		boolean found = false;

		while (lowerIndex <= higherIndex) {

			int mid = (lowerIndex + higherIndex) / 2;

			if (arr[mid] == element) {
				System.out.println("Element found at " + mid + " index.");
				found = true;
				break;
			}

			if (element > arr[mid]) {
				lowerIndex = mid + 1;
			} else {
				higherIndex = mid - 1;
			}
		}
		if (!found) {
			System.out.println("Element not found.");
		}
	}
}
