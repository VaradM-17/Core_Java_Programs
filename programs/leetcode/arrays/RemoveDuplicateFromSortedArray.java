// LeetCode Problem 26: Remove Duplicates from Sorted Array
package com.programs.leetcode.arrays;

public class RemoveDuplicateFromSortedArray {

	public static int removeDuplicates(int[] nums) {
		int n = nums.length;
		int k = 0;

		for (int i = 0; i < n; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				nums[k] = nums[i];
				k++;
			}
		}

		return k;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 1, 2, 2, 3, 3, 4 };

		System.out.print("Given Sorted Array With Duplicates: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		int k = removeDuplicates(nums);
		System.out.println("\n\nk = " + k);

		System.out.print("\nSorted Array Without Duplicate: ");
		for (int i = 0; i < k; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
