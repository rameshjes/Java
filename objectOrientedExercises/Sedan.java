package objectOrientedExercises;

public class Sedan extends Car {

	int length;

	public Sedan(int speed, double regularPrice, String colour, int length) {
		super(speed, regularPrice, colour);
		this.length = length;
	}

	public double getSalePrice() {
		// If length greater than 20 feets, 5 % discount
		// else 10% discount
		if (length > 20) {
			double discount = super.getSalePrice() * 0.05;

			return (super.getSalePrice() - discount);
		} else {
			double discount = super.getSalePrice() * 0.10;

			return (super.getSalePrice() - discount);
		}

	}

}
