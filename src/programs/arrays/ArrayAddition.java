package programs.arrays;

public class ArrayAddition {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30 };
		int add = 0;
		for (int i = 0; i < a.length; i++) {
			add = add + a[i];
		}
		System.out.println("Addition of Array is : " + add);
	}
}
