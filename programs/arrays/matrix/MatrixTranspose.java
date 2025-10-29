package com.programs.arrays.matrix;

import java.util.Scanner;

public class MatrixTranspose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		System.out.print("\nEnter columns: ");
		int columns = sc.nextInt();

		int arr[][] = new int[rows][columns];

		System.out.print("\nEnter elements in matrix: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nYour matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int transposeMatrix[][] = new int[columns][rows];
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				transposeMatrix[i][j] = arr[j][i];
			}
		}

		// print transpose matrix
		System.out.println("\nYour Transpose matrix: ");
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(transposeMatrix[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
