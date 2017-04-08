package objectOrientedExercises;

public class Ford extends Car {

	// Sub Class of Car

	int year;
	int manufacturerDiscount;

	public Ford(int speed, double regularPrice, String colour, int year, int manufacturerDiscount) {
		super(speed, regularPrice, colour);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	public double getSalePrice() {

		return (super.getSalePrice() - manufacturerDiscount);

	}

}
