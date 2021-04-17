package com.sdetjava.demo;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Factorial facto = new Factorial();
		facto.getFactorial(sc);

	}

	public int getFactorial(Scanner sc) {
		int n, c, f = 1;

		System.out.println("Enter a Number to calculate its factorial");

		n = sc.nextInt();

		if (n < 0)
			System.out.println("Please Enter non-negative.");
		else {
			for (c = 1; c <= n; c++)
				f = f * c;

			System.out.println("Factorial of " + n + " is = " + f);
		}

		return f;

	}

}
