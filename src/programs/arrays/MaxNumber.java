package programs.arrays;

public class MaxNumber {
	public static void main(String[] args) {
		int a[] = { 12, 18, 11,21, 17 };
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Maximum Value is : " + max);
	}
}
