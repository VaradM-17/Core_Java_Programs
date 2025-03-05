package programs.string;

import java.util.Scanner;

public class PrintVowels {
	public static void main(String[] args) {
		String namelist[] = new String[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < namelist.length; i++) {
			System.out.println("Enter Student Names : ");
			namelist[i] = sc.next();
		}

		for (int i = 0; i < namelist.length; i++) {
			String name = namelist[i];

			System.out.print("Vowles in " + name + " ");

			for (int j = 0; j < name.length(); j++) {
				char ch = name.toLowerCase().charAt(j);

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					System.out.print(ch + " ");
				}
			}
			System.out.println();
		}
	}
}
