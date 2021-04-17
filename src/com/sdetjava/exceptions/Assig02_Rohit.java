package com.sdetjava.exceptions;

public class Assig02_Rohit {

	public static void main(String[] args) {
		
		Assig02_Rohit test = new Assig02_Rohit();
		System.out.println("*******************MAIN METHOD STARTS***************************");
		System.out.println("");
		
//**************************************Email Validation ***************************************************
		
//		System.out.println("EmailID 'null' is valid? "+test.validateEmail(null));
//		System.out.println("EmailID 'persistent.com' is valid? "+test.validateEmail("persistent.com"));
//		System.out.println("EmailID 'abc@persistent' is valid? "+test.validateEmail("abc@persistent"));
//		System.out.println("EmailID '@abc.persistent' is valid? "+test.validateEmail("@abc.persistent"));
//		System.out.println("EmailID 'abc.persistent@com' is valid? "+test.validateEmail("abc.persistent@com"));
		System.out.println("EmailID 'abc@persistent.com' is valid? "+test.validateEmail("abc@persistent.com"));
		System.out.println("***********************************************************************");
		System.out.println("");

//*************************************Names Validation*****************************************************
		//System.out.println("Name 'null' is valid ? : "+test.validateName(null));
		//System.out.println("Name 'Krishna123' is valid ? : "+test.validateName("Krishna123"));
		System.out.println("Name 'Krishna' is valid ? : "+test.validateName("Krishna"));
		System.out.println("***********************************************************************");
		System.out.println("");
		
//*************************************Sum Of First n Numbers***********************************************
		
		int[] inputAry = { 1, 2, 3, 4, 5 };
		int n = 5;
		long sum = test.printSum(inputAry, n);
		System.out.println("The Sum of first " + n + " Number is : " + sum);
		System.out.println("***********************************************************************");
		System.out.println("");
		
//**************************************Insert a New Element in The Array***********************************
		
		int number = 50;
		int position = 3;
		int[] inputArray = { 10, 30, 40, 80 };
		System.out.println("Array Before Inserting " + number + ":");
		for (int ary : inputArray) {
			System.out.print(ary + " ");
		}
		inputArray = test.insertNumberInAry(inputArray, number, position);
		System.out.println("\nArray After Inserting " + number + " at Position : " + position);
		for (int num : inputArray) {
			System.out.print(num + " ");
		}
		System.out.println("");
		System.out.println("***********************************************************************");
		
//**********************************************************************************************************		
		System.out.println("END OF MAIN ");
	}
	
//************************************1.Email Validation Method*********************************************
	
	/**
	 * 1. Write a method to validate email in case email is not valid based on
	 * following condn then throw an Exception with " Invalid Email" as a message -
	 * email should not be null - must contain @ - must contain . - must contain .
	 * after @ - must not start with @ add more such invalid scenarios
	 */

	public boolean validateEmail(String email) throws RuntimeException {
		if (email == null) {
			throw new RuntimeException("Email value cna't be null");
		}
		if (!email.contains("@")) {
			throw new RuntimeException("Email must have @ ");
		}
		if (!email.contains(".") || email.indexOf('.') < (email.indexOf('@') + 2)) {
			throw new RuntimeException(" Invalid email...");
		}

		if (email.indexOf('@') == 0) {
			throw new RuntimeException("Email cann't start with @.....");
		}

		return true;

	}
	
//************************************2.Names Validation Method*********************************************

	/**
	 * 2. Write a method to validate name 
	 * - name should not be null 
	 * - name should not contains any number
	 */

	public boolean validateName(String name) throws RuntimeException {
		if (name == null) {
			throw new RuntimeException("Name should not contain null");
		}
		char[] nameChar = name.toCharArray();
		for (char c : nameChar) {
			if (Character.isDigit(c)) {
				throw new RuntimeException("Name should not contain Digits");
			}
		}
		return true;

	}
	
//************************************3.PrintSum Method***************************************************	

	/**
	 * 3. Write a printsum method which will return sum of first n numbers - throw
	 * userdefined InvalidInputException if array contains less than n numbers -
	 * signature of printsum method as follows public long printSum(int
	 * []inputAry,int n) throws InvalidInputException
	 */

	public long printSum(int[] inputAry, int n) throws InvalidInputException {

		int sum = 0;
		if (inputAry.length < n)
			throw new InvalidInputException("InvalidInputException");
		for (int i = 0; i < n; i++) {
			sum = sum + inputAry[i];
		}
		return sum;
	}
	
//************************************4.Insertion Of Elements in Array Method*******************************	
	
	/**
	 * 4. insert given number at given position in a given array eg.
	 * int[]array={10,30,40,80} number =50 position = 3
	 * insetNumberInAry(array,number,position) o/p array should contain data like
	 * =>{10,30,40,50,80} Signature => int [] insertNumberInAry(int []ary,int
	 * number,int position) Exception scenarios - throw
	 * ArrayIndexOutOfBoundsException if given position exceeds array size
	 */

	public int[] insertNumberInAry(int[] ary, int number, int position) throws RuntimeException {
		int i;
		int size = 4 + 1;
		if (position > ary.length) {
			throw new RuntimeException("\nArrayIndexOutOfBoundsException");
		}
		int extendedAry[] = new int[size];
		for (i = 0; i < size; i++) {
			if (i < position - 1)
				extendedAry[i] = ary[i];
			else if (i == position - 1)
				extendedAry[i] = number;
			else
				extendedAry[i] = ary[i - 1];
		}
		return extendedAry;
	}
	
//**********************************************************************************************************
	
}
