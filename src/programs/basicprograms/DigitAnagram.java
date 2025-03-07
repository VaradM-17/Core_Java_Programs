package programs.basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class DigitAnagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		String numOne = sc.next();

		System.out.print("Enter second number: ");
		String numTwo = sc.next();

		sc.close();

		if (numOne.length() != numTwo.length()) {
			System.out.println("The numbers are not anagrams.");
			return;
		}

		char arrOne[] = numOne.toCharArray();
		char arrTwo[] = numTwo.toCharArray();

		Arrays.sort(arrOne);
		Arrays.sort(arrTwo);

		if (Arrays.equals(arrOne, arrTwo)) {
			System.out.println("The numbers are anagrams.");
		} else {
			System.out.println("The numbers are not anagrams.");
		}
	}
}
