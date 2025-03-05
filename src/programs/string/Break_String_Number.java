package programs.string;

public class Break_String_Number {

	public static void main(String[] args) {
		String user = "varad123";
		StringBuilder letters = new StringBuilder();
		StringBuilder number = new StringBuilder();

		for (int i = 0; i < user.length(); i++) {
			char current = user.charAt(i);

			if (Character.isDigit(current)) {
				number.append(current);
			} else if (Character.isLetter(current)) {
				letters.append(current);
			}
		}

		System.out.println("String: " + letters.toString());
		System.out.println("Numbers: " + number.toString());
	}

}
