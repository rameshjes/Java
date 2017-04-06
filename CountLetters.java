package practise;

import java.util.Scanner;

public class CountLetters {

	// Count numbers, spaces, letters
	// We can also use character with their method(is digit, is space, is
	// letter) but it is deprecated
	// Therefore, we use this method
	public static void main(String[] args) {
		Scanner userinp = new Scanner(System.in);
		System.out.println("Enter the letters");
		String input = userinp.nextLine();
		countCharacters(input);
	}

	private static void countCharacters(String input) {
		int spaces = 0, numbers = 0;

		for (char c : input.toCharArray()) {
			if (c == ' ') {
				spaces++;
			}

			if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
					|| c == '9') {
				numbers++;
			}

		}

		int lengthString = input.length() - spaces - numbers;
		System.out.println("Number of letters you entered : " + lengthString);
		System.out.println("Number of spaces you entered :" + spaces);
		System.out.println("Numbers in entered string are: " + numbers);
	}

}
