package programs.basicprograms;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit : ");

		int n = sc.nextInt();
		int cnt = 0;

		while (n > 0) {
			n = n / 10;
			cnt++;
		}
		System.out.println(cnt);
	}
}
