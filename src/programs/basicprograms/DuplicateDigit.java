package programs.basicprograms;

public class DuplicateDigit {
	public static void main(String[] args) {
		int numbers[] = { 1, 2, 3, 4, 5, 6, 3, 2, 7, 8, 8, 9, 1 };

		System.out.print("Duplicate numbers: ");

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					System.out.print(numbers[i] + " ");
				}
			}
		}
	}
}
