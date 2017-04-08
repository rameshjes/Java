package objectOrientedExercises;

public class Car {

	/*
	 * Create a super class Car, Car class has following fields: intspeed;
	 * doubleregularprice; Stringcolour; double getSalePrice()
	 * 
	 * Car has sub classes: Truck, Ford, Sedan
	 */
	int speed;
	double regularPrice;
	String colour;

	public Car(int speed, double regularPrice, String colour) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.colour = colour;
	}

	public double getSalePrice() {
		return regularPrice;

	}
}
