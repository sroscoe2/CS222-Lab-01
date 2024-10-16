package main;

import java.util.Random;

public class End {
	
	public static final double[] permitCosts = {9.91,0.0,9.92,11.83,14.83,17.83,20.75,150.00};


	
	public static String categorizePermits(double val) {
		/*
		 * Here are the monthly parking permit categories and prices:
		 * Student: 9.91 
		 * Disabled: 0.0
		 * Employee: 9.92, 11.83, 14.83, 17.83, or 20.75
		 * Visitor: 150.00
		 */

		/* TODO write logic (if, else if, else) to figure out,
		 * given a permit price,
		 * what category that permit belongs to.
		 * Print "nobody" if it's not one of the specified values.
		 */
		
		
		return "";
	}
	
	public static void main(String[] args) {
		
		// test with random index
		Random generator = new Random();
		int randomIndex = generator.nextInt(permitCosts.length);
		double val = permitCosts[randomIndex];		
		
		// the following should output either "Student", "Employee", "Disabled", or "Visitor"
		System.out.printf("Permit belongs to: %s\n",categorizePermits(val));
		// the following should output "nobody" 
		System.out.printf("Permit belongs to: %s\n",categorizePermits(22.36));
		
		
	}

}
