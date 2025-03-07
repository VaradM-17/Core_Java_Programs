package programs.string;

import java.util.Arrays;
import java.util.Scanner;

public class Annagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String stringOne = sc.nextLine();
		String stringTwo = sc.nextLine();

		if (stringOne.length() != stringTwo.length()) {
			System.out.println("The strings are not annagram.");
			return;//here return stops the main method if not match
		}

		char arrOne[] = stringOne.toCharArray();
		char arrTwo[] = stringTwo.toCharArray();

		Arrays.sort(arrOne);
		Arrays.sort(arrTwo);

		if (Arrays.equals(arrOne, arrTwo)) {
			System.out.println("The strings are annagram.");
		} else
			System.out.println("The strings are not annagram.");
	}
}