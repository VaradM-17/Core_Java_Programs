package programs.arrays;

public class PrimeArray {
	public static void main(String[] args) {
		int a[] = { 7, 2, 10, 5 };
		System.out.print("Prime numbers from Array are ");

		for (int i = 0; i < a.length; i++) {

			int ArrayIndexNumber = a[i];
			int div = 0;

			for (int j = 1; j < a.length; j++) {
				if (ArrayIndexNumber % j == 0) {
					div++;
				}
			}
			if (div == 2) {
				System.out.print(ArrayIndexNumber + " ");
			}
		}
	}
}
