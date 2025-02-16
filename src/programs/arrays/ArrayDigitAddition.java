package programs.arrays;

public class ArrayDigitAddition {

	public static void main(String[] args) {

		int a[] = { 58, 91, 46, 75 };

		int sum = 0;
		int max = 0;

		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			int add = 0;
			
			while (n > 0) {
				int rem = n % 10;
				add = add + rem;
				n = n / 10;
			}
			if (add > sum) {
				sum = add;
				max = a[i];
			}
		}
		System.out.println(max);
	}

}
