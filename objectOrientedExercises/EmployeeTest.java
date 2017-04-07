package objectOrientedExercises;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter number of employees in your company");
		int numberOfEmployees = userinput.nextInt();
		double yearly =0;
		for (int i = 0; i < numberOfEmployees; i++) {
			yearly = 0.0;
			System.out.println("Enter VorName of employee: ");
			String firstname = userinput.next();
			System.out.println("Enter NachName of employee: ");
			String lastname = userinput.next();
			System.out.println("Enter salary of employee: ");
			int salary = userinput.nextInt();
			Employee employee1 = new Employee(firstname, lastname, salary);
			yearly = employee1.getmonthlySalary();
			System.out.println("===============================================");
			System.out.println(
					"VorName: " + firstname + "\n" + "NachName: " + lastname + "\n" + "Yearly Salary is: " + yearly);
			yearly += yearly*0.10;
			System.out.println("Salary after Bonus is: " + yearly);
			System.out.println("===============================================");
		}
	}
}
