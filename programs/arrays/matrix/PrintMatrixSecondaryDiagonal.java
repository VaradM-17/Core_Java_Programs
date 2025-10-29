package com.programs.arrays.matrix;

import java.util.Scanner;

public class PrintMatrixSecondaryDiagonal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();

		System.out.print("\nEnter number of columns: ");
		int columns = sc.nextInt();

		int arr[][] = new int[rows][columns];

		System.out.print("\nEnter elements in matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nYour matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("\nYour matrix secondary diagonal:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (j == columns - 1 - i) {
					// arr[i][j] = arr[0][2] = 3
					// arr[i][j] = arr[1][1] = 5
					// arr[i][j] = arr[2][0] = 7
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

		sc.close();
	}
}
