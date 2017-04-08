package objectOrientedExercises;

public class SavingsAccount {

	static double annualInterestRate;
	private double savingsBalance;

	public SavingsAccount() {
		annualInterestRate = 0.0;
		savingsBalance = 0.0;
	}

	public SavingsAccount(double annualInterestRate, double savingsBalance) {
		this.annualInterestRate = annualInterestRate;
		this.savingsBalance = savingsBalance;
		System.out.println("deposited amount is: " + savingsBalance);

	}

	public static double calculateMonthlyInterest(double annualInterestRate, double savingsBalance) {
		double monthlyInterest = ((savingsBalance * annualInterestRate) / 12);
		// System.out.println("The monthly Interest on this amount is: " +
		// monthlyInterest);
		return monthlyInterest;
	}

	public static double updatedBalance(double annualInterestRate, double savingsBalance) {
		double monthlyInterest = calculateMonthlyInterest(annualInterestRate, savingsBalance);
		savingsBalance = savingsBalance + monthlyInterest;
		System.out.println("The new balance after adding monthly interest is: " + savingsBalance);
		annualInterestRate = monthlyInterest * 12;
		System.out.println("The annual Interest Rate is: " + annualInterestRate);
		return savingsBalance;
	}

}
