package programs.basicprograms;
import java.util.Scanner;

public class RevDigit {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit : ");

		int n = sc.nextInt();
		int rev = 0;

		System.out.println("Given Digit " + n);

		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println("Reversed Digit " + rev);
	}
}
