package exercise1;

import java.util.InputMismatchException;

/**
 * Author Ramesh Kumar 
 */
// Exercise : 01
/* This class takes input from user and computes sum, product, 
	average(integer) given in question, variance, largest number, smallest numer. */

import java.util.Scanner;

public class Integers {

	public int sum, count, average, largenum, smallnum = 0;
	public int product = 1;
	public double variance, temp = 0;
	Scanner userinput; // takes userinput
	int numbers[]; // numbers entered by user are stored in array
	int firstnum; // user input

	public void integers() {
		userinput = new Scanner(System.in);
		System.out.println("How many numbers you want to enter to compute basic operations?");
		
		// If user enters negative number or any invalid input 
		try {
			firstnum = userinput.nextInt();

			int numbers[] = new int[firstnum];

			System.out.println("Please enter  " + firstnum
					+ " numbers from 1 to 100 to get sum, product, average, variance, smallest num, largest num");
			if (firstnum < 100 && firstnum > 0) {
				for (int k = 0; k < firstnum; k++) {
					System.out.println("Enter the number = ");
					numbers[k] = userinput.nextInt();
				}
				// Computing Sum, product and average
				for (int i = 0; i < numbers.length; i++) {
					sum = addFunction(sum, numbers[i]);
					product = productFunction(product, numbers[i]);
					average = averageFunction(sum, numbers.length);
				}

				// Computing Variance
				for (int j = 0; j < numbers.length; j++) {
					temp = temp + (numbers[j] - average) * (numbers[j] - average);

				}
				variance = temp / numbers.length;

				// Computing Largest Number
				for (int p = 0; p < numbers.length; p++) {

					if (numbers[p] > largenum) {
						smallnum = numbers[0];
						largenum = numbers[p];
					}

					// Computing Smallest Number

					for (int k = 0; k < numbers.length; k++) {
						
						if (numbers[k] < smallnum) {

							smallnum = numbers[k];

						}
					}
				}
			}

			// Printing all results on console
			System.out.println("------------------------------------------");
			System.out.println("Smallest number is = " + smallnum);
			System.out.println("Largest number is = " + largenum);
			System.out.println("Total Sum is = " + sum);
			System.out.println("Total Product is = " + product);
			System.out.println("Total Average is = " + average);
			System.out.println("The variance is = " + variance);
			System.out.println("------------------------------------------");
		}

		catch (NegativeArraySizeException | InputMismatchException e) {
			System.out.println("Caution : Please don't enter negative numbers, or any letters !!!");

		}

	}

	public static void main(String[] args) {
		Integers objint = new Integers();
		objint.integers();
	}

	// Sum Function
	public int addFunction(int add, int b) {
		add = add + b;
		return add;
	}

	// Product Function
	public int productFunction(int product, int c) {
		product = product * c;
		return product;
	}

	// Average Function
	public int averageFunction(int average, int d) {
		average = sum / d;
		return average;
	}

}
