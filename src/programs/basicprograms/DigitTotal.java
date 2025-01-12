package programs.basicprograms;

import java.util.Scanner;

public class DigitTotal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit : ");

		int n = sc.nextInt();
		int add = 0;

		while (n > 0) {
			int rem = n % 10;
			add = add + rem;
			n = n / 10;
		}
		System.out.println("Total Addition of Digit " + add);

	}
}
