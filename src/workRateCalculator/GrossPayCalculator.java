package workRateCalculator;

import java.util.Scanner;

public class GrossPayCalculator {
	public static void main(String arg[]) {
		// Get number of work hours
		System.out.println("Enter number of hours employee worked");
		Scanner scanner = new Scanner(System.in);
		int hours = scanner.nextInt();
		
		// Get Hourly pay
		System.out.println("Enter hourly pay rate");
		double payrate = scanner.nextDouble();
		scanner.close();
		
		// Multiply work hours with hourly rate
		double grossPay = hours * payrate;
		
		// Print Gross pay
		System.out.println("The Employee Gross pay rate is $" + grossPay);
		
	}

}
