package programs.basicprograms;

import java.util.Scanner;

public class FactNumber {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit : ");

		int n = sc.nextInt();
		int fact = 1;

		for (int i = n; i > 0; i--) {
			System.out.print(fact + " * " + i + " = ");
			fact = fact * i;
			System.out.println(fact);
		}
	}
}
