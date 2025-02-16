package programs.arrays;

public class ArraySort {
	public static void main(String[] args) {

		int a[] = { 7, 2, 10, 5 };
		
		System.out.print("Sorted Array : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if (a[j] > a[i]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
