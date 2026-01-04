package com.programs.sorting;

public class BubbleSortExample {

	public void sort(int num[]) {

		for (int i = 1; i < num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int num[] = { 10, 1, 3, 4, 6, 8 };

		BubbleSortExample bubbleSort = new BubbleSortExample();

		bubbleSort.sort(num);

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}
}
