package programs.arrays;

public class FindMultipleMissingNumber {
	public static void main(String[] args) {
		int numbers[] = { 0, 1, 2, 3, 6, 7, 9 };

		int expectedNumber = numbers[0];

		System.out.println("Missing numbers:");

		for (int i = 0; i < numbers.length; i++) {
			while (expectedNumber < numbers[i]) {
				System.out.print(expectedNumber + " ");
				expectedNumber++;
			}
			expectedNumber++;
		}
	}
}
