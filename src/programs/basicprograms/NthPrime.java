package programs.basicprograms;

import java.util.Scanner;

public class NthPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit : ");// Example 10

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) 
		{
			int div = 0;
			
			for (int j = 1; j <=i ; j++) 
			{
				if (i%j==0) {
					div++;
				}
			}
			if (div==2) {
				System.out.println(i + " prime number");
			}
			else {
				System.out.println(i+ " is not prime number");
			}
		}
		

	}
}
