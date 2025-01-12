package programs.basicprograms;
import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int n = sc.nextInt();
		int div = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				div++;
			}
		}

		if (div == 2) {
			System.out.println("Given Number " + n + " is a Prime Number");
		} else {
			System.out.println("Given Number " + n + " is not a Prime Number");
		}
	}
}
