package programs.string;

import java.util.HashSet;
public class RepetedWords {

	public static void main(String[] args) {
		String sentence = "hi varad how are you varad";

        String[] words = sentence.split(" ");
        HashSet<String> checked = new HashSet<>();

        for (String word : words) {
            if (!checked.add(word)) {
                System.out.println("repeted words : " + word);
            }
        }
	}

}
