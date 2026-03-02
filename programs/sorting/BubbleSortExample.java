package com.programs.sorting;

public class BubbleSortExample {

	public static void main(String[] args) {

		int num[] = { 10, 1, 3, 4, 6, 8 };
		int length = num.length;

		for (int i = 0; i < length - 1; i++) { // passes

			boolean swapped = false;

			for (int j = 0; j < length - 1 - i; j++) { // traverse

				if (num[j] > num[j + 1]) { // compare

					// swap
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;

					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}