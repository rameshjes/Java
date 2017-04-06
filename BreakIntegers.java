package practise;

import java.util.Scanner;

public class BreakIntegers {

	public static void main(String[] args) {
		BreakIntegers classReference = new BreakIntegers();
		Scanner userinp = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		String str = userinp.nextLine();
		classReference.breakIntegersAddSpaces(str);
		System.out.println(" ");
		System.out.println("This method will count number of vowels and numbers of words entered in your input ");
		String input = userinp.nextLine();
		classReference.countVowels(input);
		classReference.countWordsInString(input);
		classReference.print_Chars('(', 'z', 10);

	}

	public void breakIntegersAddSpaces(String input) {
		for (char c : input.toCharArray()) {
			System.out.print(c + " ");
		}
	}

	public void countVowels(String letter) {
		int vowels = 0;
		for (char c : letter.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels++;
				// System.out.println(c);
			}
		}

		System.out.println("The number of vowels entered in your input are: " + vowels);
	}

	public void countWordsInString(String input) {
		int words = 0;
		for (char c : input.toCharArray()) {

			if (c == ' ') {
				words++;
			}
		}

		words = words + 1; // because we are counting spaces so number of words
		// should always be 1 greater than number of spaces

		System.out.println("Number of words you entered are: " + words);

	}

	public void print_Chars(char char1, char char2, int n) {
		for (int ctr = 1; char1 <= char2; ctr++, char1++) {

			System.out.print(char1 + " ");

			if (ctr % n == 0)
				System.out.println("");
		}
		System.out.print("\n");
	}

}
