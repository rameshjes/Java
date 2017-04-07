package objectOrientedExercises;

import java.util.Scanner;

public class InvoiceTest {
	// This class calls method of InvoiceApplication
	public static void main(String[] args) {
		System.out.println("Enter quantity of items:");
		Scanner userinput = new Scanner(System.in);
		int quantity = userinput.nextInt();
		System.out.println("Enter price of item:");
		double price = userinput.nextDouble();
		InvoiceApplication reference = new InvoiceApplication("ABC", "This product is really good", quantity, price);
		double totalAmount = reference.getInvoiceAmount();
		System.out.println("Quantity of Items is: " + quantity + "\n" + "Price of item is: " + price + "\n"
				+ "Total Invoice Amount is: " + totalAmount);

	}
}
