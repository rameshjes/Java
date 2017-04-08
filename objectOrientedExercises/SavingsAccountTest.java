package objectOrientedExercises;

public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(0.04, 2000);
		System.out.println("Monthly interest and new balance of user1 is:");
		saver1.updatedBalance(0.04, 2000);
		System.out.println("===================================================");
		SavingsAccount saver2 = new SavingsAccount(0.04, 3000);
		System.out.println("Monthly interest and new balance of user2 is:");
		saver1.updatedBalance(0.04, 3000);

	}
}
