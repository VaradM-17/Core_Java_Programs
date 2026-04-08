package com.programs.leetcode.arrays;

import java.util.Arrays;

public class MoveZerosArray {
	private static int[] moveZeros(int[] arr) {

		int nonZeros = 0;
		for (int current = 0; current < arr.length; current++) {
			if (arr[current] != 0) {
				arr[nonZeros] = arr[current];
				nonZeros++;
			}
		}
		for (int i = nonZeros; i < arr.length; i++) {
			arr[i] = 0;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 0, 3, 0 };
		System.out.println(Arrays.toString(moveZeros(arr)));
	}

}
