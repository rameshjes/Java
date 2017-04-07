package objectOrientedExercises;

public class Employee {

	private String vorName;
	private String nachName;
	private double monthlySalary;

	public Employee(String vorName, String nachName, double monthlySalary) {

		if (monthlySalary < 0) {
			this.monthlySalary = 0;
		}
		else {
			this.monthlySalary = monthlySalary;
		}

		if (vorName != null) {
			this.vorName = vorName;
		}

		if (nachName != null) {
			this.nachName = nachName;
		}

	}

	public String getvorName() {
		return vorName;
	}

	public void setvorName(String vorName) {
		this.vorName = vorName;

	}

	public String getnachName() {
		return nachName;
	}

	public void setnachName(String nachName) {
		this.nachName = nachName;
	}

	public double getmonthlySalary() {
		return monthlySalary * 12; // yearly salary
	}

	public void setmonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;

	}

}
