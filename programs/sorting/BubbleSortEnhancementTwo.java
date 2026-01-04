package com.programs.sorting;

public class BubbleSortEnhancementTwo {

	public void enhancedSort(int num[]) {
		int i = 0;
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			i++;
			for (int j = 0; j < num.length - i; j++) {
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;

					swapped = true;
				}
			}
		}
	}

	public static void main(String[] args) {

		int num[] = { 10, 1, 3, 4, 6, 8, 11 };
		BubbleSortEnhancementTwo bubbleSortEnTwo = new BubbleSortEnhancementTwo();

		bubbleSortEnTwo.enhancedSort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
