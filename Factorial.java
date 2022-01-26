package week1.day2;

import java.util.Iterator;

public class Factorial {

	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5 output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) How to assign the variables 2) How to use shortcuts 3) How to calculate factorial using Java
	 * 
	 */

	public static void main(String[] args) {

		// Declare your input as 5
		int num = 5;

		// Declare an integer variable fact as 1

		int n = 1, fact = 1;
		// Iterate from 1 to your input (tip: using loop concept)
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
		// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to
		// the 'fact' variable)

		// End of loop

		// Print factorial (fact)

	}

}