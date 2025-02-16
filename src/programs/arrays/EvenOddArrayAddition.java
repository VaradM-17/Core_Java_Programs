package programs.arrays;

public class EvenOddArrayAddition {
	public static void main(String[] args) {
		int a[] = { 7, 2, 10, 5 };
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenSum = evenSum + a[i];
			} else {
				oddSum = oddSum + a[i];
			}
		}
		System.out.println("Addition of even number is " + evenSum);
		System.out.println("Addition of odd number is " + oddSum);
	}

}
