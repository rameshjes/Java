package objectOrientedExercises;

import java.util.Scanner;

public class DateTest {
	
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter year of birth");
		int year = userinput.nextInt();
		System.out.println("Enter month of birth");
		int month = userinput.nextInt();
		System.out.println("Enter date of birth");
		int date = userinput.nextInt();
		Date reference = new Date(year,month,date);
		
		String displayDate = reference.toString();
		System.out.println("You complete date of birth is: "+ displayDate);
	}

}
