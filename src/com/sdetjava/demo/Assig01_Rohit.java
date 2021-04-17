
package com.sdetjava.demo;

import java.util.Scanner;

/**
 * @author Rohit
 *
 */
public class Assig01_Rohit {

	public static void main(String[] args) {
		Assig01_Rohit p1 = new Assig01_Rohit();
		Scanner input = new Scanner(System.in);
		
		int numberOfSpace = p1.getTotalSpaceInString(input);
		System.out.println("Total no. of Spaces present in String are : "+numberOfSpace);
		
		p1.getStringPattern(input);
		
		p1.getSplitedString(input);
		
		p1.getNumberPattern(input);

		int total = p1.getSumOfEvens(input);
		System.out.println("The Sum Even numbers present in array is: " + total);

		p1.getEvensAndMultiplesOfFive(input);

		int chars = p1.getTotalCharacterInString(input);
		System.out.println("Total no. of Characters are: "+chars);

		int vowelsNumbers = p1.getTotalVowels(input);
		System.out.println("Total no. of Vowels are : "+vowelsNumbers);

		p1.getFactorial(input);

		p1.getFibonacciSeries(input);

	}

//*******************1. Find the total of even numbers present in an array*******************************
	
	public int getSumOfEvens(Scanner scanner) {
		System.out.println("");
		System.out.println("Enter how many Elements wants to Store in an Array: ");
		int num = scanner.nextInt();
		int[] array = new int[num];
		System.out.println("Enter the elements to store in the array: ");
		int sum = 0;

		for (int i = 0; i < num; i++) {
			array[i] = scanner.nextInt();
		}
		for (int number : array) {
			if (number % 2 == 0) {
				sum += number;
			}
		}
		return sum;
	}

//*****************2.Print all even and multiple of 5 numbers from an array*********************************	
	
	public void getEvensAndMultiplesOfFive(Scanner scanner) {
		System.out.println("");
		System.out.println("Enter number of Elements wants to Store in an Array: ");
		int num = scanner.nextInt();
		int[] array = new int[num];
		System.out.println("Enter the elements which are to be stored in the array: ");
		
		for (int i = 0; i < num; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("These are the nombers present in Array which are Even and divisible by 5:");

		for (int number : array) {
			if (number % 2 == 0 || number % 5 == 0)
				System.out.println(number);
		}
	}

//****************3. Find the total characters present in a String******************************************

	public int getTotalCharacterInString(Scanner scanner) {
		System.out.println("");
		System.out.println("Enter a String to count number of Characters present in it:");
		String str = scanner.next();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}
		return count;
	}

//****************4. Find the total vowels present in a String*********************************************

	int getTotalVowels(Scanner sc) {
		System.out.println("");
		System.out.println("Enter a String to check no. of Vowels present in it: ");
		String str = sc.next();
		char chars[] = str.toCharArray();
		int total = 0;
		VowelsTest test = new VowelsTest();
		for (char temp : chars) {
			if (test.isVowel(temp))
				total = total + 1;
		}
		return total;
	}

	public boolean isVowel(char inputChar) {
		boolean result = false;
		switch (inputChar) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			result = true;
			break;
		default:
			result = false;
		}

		return result;
	}

//****************5. Find the total spaces present in a String********************************************
	
	public int getTotalSpaceInString(Scanner input) {
		System.out.println("");
		System.out.println("Enter a Sentence to check no. of Spaces present in it:");
		String str = input.nextLine();
		int i = 0, count = 0;
		while (i < str.length()) {
			if (str.charAt(i) == ' ') {
				count++;
			}
			i++;
		}
		return count;
	}

//***************6. Find Factorial of entered Number*****************************************************

	public long getFactorial(Scanner scanner) {
		System.out.println("");

		System.out.println("Enter a Number to calculate its factorial");

		int input = scanner.nextInt();
		long factorial = 1l;

		if (input < 0)
			System.out.println("Please Enter non-negative.");
		else {
			for (int c = 1; c <= input; c++)
				factorial = factorial * c;

			System.out.println("Factorial of " + input + " is = " + factorial);
		}

		return factorial;

	}

//******************7. Print the Fibonacci Sequence ******************************************************

	public int getFibonacciSeries(Scanner scanner) {
		System.out.println("");
		System.out.println("Enter any Number to get its Fibonacci Series:");
		int total = 0, number1 = 1, number2 = 1;
		int input = scanner.nextInt();
		System.out.print("1 1 ");
		while (total <= input) {
			total = number1 + number2;
			if (total >= input) {
				break;
			}
			System.out.print(total + " ");
			number1 = number2;
			number2 = total;
		}
		
		return total;

	}

//********************************* 8. Print the following patterns****************************************
//******************* 8.1 Number pattern*******************************************************************

	public void getNumberPattern(Scanner rows) {
		System.out.println("");
		System.out.println("Enter Number of Rows to get the Pattern:");
		int num = rows.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

		for (int i = num - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		

	}

//****************8.2 for a given sting print following pattern for eg if i/p str = Hello*****************

	public void getStringPattern(Scanner input) {
		System.out.println("");

		System.out.println("Enter a String to get its Pattern: ");

		String str = input.nextLine();

		char[] a = str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[j]);
			}
			System.out.println();
		}
	}
//*****************8.3  For entered String Split String using spaces and print word on each line for eg   String str=" This is a Java World";****************
	
	public void getSplitedString(Scanner input) {
		System.out.println("");
		System.out.println("Enter a Sentence which is to be Splited:");
		String str = input.nextLine();
		String[] strArray = str.split(" ");

		for (String split : strArray) {

			System.out.println(split);
		}

	}

}
