package com.programs.sorting;

public class BubbleSortExample {

	public static void main(String[] args) {

		int num[] = { 10, 1, 3, 4, 6, 8 };
		int length = num.length;

		int temp = 0;
		for (int i = 1; i < length; i++) {// passes

			boolean swapped = false;
			for (int j = 0; j < length - i; j++) {// traverse

				if (num[j] > num[j + 1]) {// compare

					// swap
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;

					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}
}
