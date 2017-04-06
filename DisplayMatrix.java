package practise;

public class DisplayMatrix {

	public static void main(String[] args) {
		DisplayMatrix reference = new DisplayMatrix();
		reference.displayNbyNmatrix(15);
	}

	/* *
	 * Write a Java method (takes a number n as input) to 
	 * displays an n-by-n matrix.
	 */
	private void displayNbyNmatrix(int input) {

		for (int row = 0; row < input; row++) {

			for (int col = 0; col < input; col++) {
				System.out.print(" ");
				if (col % 2 == 0) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}

			}
			System.out.println(" ");
		}
	}

}
