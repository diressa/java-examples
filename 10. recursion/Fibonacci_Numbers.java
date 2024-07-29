/*
 *  Created By: Beza Nigatu
 * 	Recursion for Fibonacci Sequence
 * 	December 14, 2021
 */

public class Fibonacci_Numbers {	
	/* Fibonacci Rules:
	 * F(0) = 0;   F(1), F(2) = 1;  
	 * F(input) = F(input-1) + F(input-2) for any input >= 2
	 */	
	public static int fibonacciNum (int input) {
		//F(0) = 0
		if (input == 0) {
			return 0;
		}
		//F(1), F(2) = 1
		if(input == 1 || input == 2) {
			return 1;
		}
		//F(input) = F(input-1) + F(input-2) for any input >= 2
		return fibonacciNum(input - 2) + fibonacciNum(input - 1);
	}
	
	public static void main(String args[]) {
		int output = 20;
		
		System.out.println("Fibonacci Rules for F(n):\n"
				+ "F(0) = 0;\n"
				+ "F(1), F(2) = 1;\n"
				+ "F(n) = F(n - 1) + F(n - 2) for any n-input > 2.\n\n");
		System.out.println("The first positive 20 inputs of a Fibonacci sequence "
				+ "(when n = [0,19]) will output:\n");
		
		for(int i = 0; i < output; i++) {
			System.out.print(fibonacciNum(i) + ", ");
		}
		System.out.println(".");
	}
}
