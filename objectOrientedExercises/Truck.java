package objectOrientedExercises;

public class Truck extends Car {
	/*
	 * SubClass of Car
	 * 
	 */

	int weight;

	public Truck(int speed, double regularPrice, String colour, int weight) {
		super(speed, regularPrice, colour);
		this.weight = weight;
	}

	// doublegetSalePrice();//Ifweight>2000,10%discount.Otherwise,20%discount.
	// Overriding : return type, arguments and name of method should be same as
	// parent class
	public double getSalePrice() {
		if (weight > 2000) {
			double discountPrice = super.regularPrice * 0.10; // 10% of regular
																// Price
			return (super.regularPrice - discountPrice);

		} else {
			double discountPrice = super.regularPrice * 0.20; // 20% of regular
																// Price
			return (super.regularPrice - discountPrice);
		}

	}

}
