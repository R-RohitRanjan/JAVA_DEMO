package com.exceptionHandling;

import java.io.IOException;

public class ExceptionDemo {
	public static void main(String[] args) {

		ExceptionDemo obj = new ExceptionDemo();

		//System.out.println(" Sum of first 10 numbers :" + sum);

		//int x = 10;
		
		System.out.println(obj.isEven());
	}

	boolean isEven() {
		int numbers[] = { 1, 2, 3, 4, 5, 10 };

		int sum = printSum(numbers);

		if (sum % 2 == 0)
			return true;
		else
			return false;
	}

	// find the sum of first 10 numbers from an array
	int printSum(int ary[]) {
		try {

		} catch (Exception ex) {

		}

		int sum = 0;
		try {
			if (ary.length < 10)
				throw new ArithmeticException();
			for (int i = 0; i < 10; i++) {
				sum = sum + ary[i];
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			// sum = 0;// reset value of sum as insufficient input
			System.out.println(" Insufficient values provided in input...");
			System.out.println(ex.getCause());
			System.out.println(" Message " + ex.getMessage());
		} catch (ArithmeticException ex) {
			System.out.println(" error occur...");
			System.out.println(ex.getMessage());
			ex.printStackTrace();

		} catch (Exception ex) {
			System.out
					.println(" This is general exception block covers all kind of exception");
		}
		return sum;
	}

}
