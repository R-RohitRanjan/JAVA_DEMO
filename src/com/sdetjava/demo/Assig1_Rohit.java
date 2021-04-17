package com.sdetjava.demo;

import java.util.Scanner;

/**
 * @author Rohit
 *
 */
public class Assig1_Rohit {

	public static void main(String[] args) {
		Assig1_Rohit demo = new Assig1_Rohit();
		Scanner sc = new Scanner(System.in);
		int[] numArray = {10,11,25,20,50,39,36,35,42,99,55,84,66,33,75,100};
		String str = "Persistent System: A Global Solutions Company";
		
		
		System.out.println("****************************************************************************");
		demo.getSplitedString("This Is A Java World");
		
		
		System.out.println("****************************************************************************");
		demo.getStringPattern("Hello");
		
		
		System.out.println("****************************************************************************");
		demo.getNumberPattern(5);
		
		
		System.out.println("****************************************************************************");
		demo.getEvensAndMultiplesOfFive(numArray);
		
		
		System.out.println("****************************************************************************");
		int sum = demo.getSumOfEvens(numArray);
		System.out.println(sum);
		
		
		System.out.println("****************************************************************************");
		int charsInString =demo.getTotalCharacterInString(str);
		System.out.println(charsInString);
		
		
		System.out.println("****************************************************************************");
		int spacesInString = demo.getTotalSpaceInString(str);
		System.out.println(spacesInString);
		
		
		
		System.out.println("****************************************************************************");
		char chars[] = str.toCharArray();
		System.out.println("Total Vowels in :" +"'"+ str +"'"+" = " + demo.getTotalVowels(chars));
		demo.getTotalVowels(chars);
		
		
		System.out.print("****************************************************************************");
		System.out.println("");
		demo.getFibonacciSeries(sc);
		
		
		System.out.println("");
		demo.getFactorial(sc);

	}

//******************Print Array Elements method*********************************************************
	
	public void printArray(int[] arrayNum) {
		for(int temp:arrayNum) {
			System.out.print(temp+" ");
		}
	}
	
//*******************1. Find the total of even numbers present in an array*******************************
	
	public int getSumOfEvens(int[] numArray) {
		System.out.println("Total no. of Elements Present in this Array are : ");
		Assig1_Rohit asig = new Assig1_Rohit();
		asig.printArray(numArray);
		System.out.println("");
		System.out.println("Sum of Evens Present in This Array are : ");
		int sum=0;
		for(int number:numArray) {
			if(number%2==0) {
				sum+=number;	
			}
		}
		return sum;	
	}
	
//*****************2.Print all even and multiple of 5 numbers from an array*********************************	
		
	public void getEvensAndMultiplesOfFive(int[] numArray) {
		System.out.println("Total Elements Present in This Array are : ");
		Assig1_Rohit asig = new Assig1_Rohit();
		asig.printArray(numArray);
		System.out.println("");
		System.out.println("Evens and Multiple of 5 numbers are Present in this Array are : ");
		for (int number : numArray) {
			if (number % 2 == 0 || number % 5 == 0)
				System.out.println(number);
		}
	}

//****************3. Find the total characters present in a String******************************************
	
	public int getTotalCharacterInString(String str) {
		System.out.println("Total no. of Characters Present in :"+"'"+str+"'"+"are : ");
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}
		return count;

	}
	
//****************4. Find the total vowels present in a String*********************************************
	
	int getTotalVowels(char[] chr) {
		int total = 0;
		Assig1_Rohit test = new Assig1_Rohit();
		for (char temp : chr) {
			if (test.isVowel(temp))
				total = total + 1;
		}
		return total;
	}

	boolean isVowel(char ch) {

		boolean result = false;
		switch (ch) {
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
	
	public int getTotalSpaceInString(String str) {
		System.out.println("Total Space Present in: "+"'"+str+"'"+" String are: ");
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

		System.out.println("Enter a Number to calculate its factorial : ");

		int input = scanner.nextInt();
		long factorial = 1l;

		if (input < 0)
			System.out.println("Please Enter non-negative.");
		else {
			for (int c = 1; c <= input; c++)
				factorial = factorial * c;

			System.out.println("Factorial of " + input + " is : " + factorial);
		}

		return factorial;

	}
	
//******************7. Print the Fibonacci Sequence ******************************************************

	public int getFibonacciSeries(Scanner sc) {
		int total=0,number1=1,number2=1;
		System.out.println("Enter any Number to get its Fibonacci Series : ");
		int n = sc.nextInt();
		System.out.print("1 1 ");
		while(total<=n) {
			total=number1+number2;
			if(total>=n) {
				break;
			}
			System.out.print(total+" ");
			number1=number2;
			number2=total;
		}
		System.out.println(" Fibonacci Series of "+n);
		return total;
		
	}
//********************************* 8. Print the following patterns****************************************
//******************* 8.1 Number pattern*******************************************************************
	
	public void getNumberPattern(int rows) {
		System.out.println("These are Number Pattern for : "+rows+" Rows");
	
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

		for (int i = rows - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("");

	}
	
//****************8.2 for a given sting print following pattern for eg if i/p str = Hello*****************

	public void getStringPattern(String str) {

		System.out.println("These are String Pattern of : "+str);

		char[] a = str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[j]);
			}
			System.out.println();
		}
		System.out.println("");

	}

	
//*****************8.3  For entered String Split String using spaces and print word on each line for eg   String str=" This is a Java World";****************
	
	public void getSplitedString(String str) {
		System.out.println("These are Splited Strings of : "+str);
		
		String[] strArray = str.split(" ");

		for (String split : strArray) {

			System.out.println(split);
		}
		System.out.println("");

	}

}
