package com.programs.leetcode.arrays;

import java.util.Arrays;

public class PlusOneArray {

	private static int[] plusOne(int[] arr) {

		int n = arr.length;
		for (int i = n - 1; i >= 0; i--) {

			if (arr[i] < 9) {
				arr[i]++;
				// As soon as return executes, method stops immediately
				return arr;
			}
			arr[i] = 0;
		}

		// if length = 0
		// 0 + 1
		// length = 1
		// at 0 = 1
		// o/p = 1,0
		int result[] = new int[arr.length + 1];
		result[0] = 1;

		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		System.out.println(Arrays.toString(plusOne(arr)));
	}
}
