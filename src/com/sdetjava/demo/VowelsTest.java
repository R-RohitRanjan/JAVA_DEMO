package com.sdetjava.demo;

import java.util.Scanner;

public class VowelsTest {

	public static void main(String[] args) {
		VowelsTest test = new VowelsTest();
		String str = "PeRSISTeNT";
		char chars[] = str.toCharArray();
		System.out.println(" Total Vowels in " + str + " = " + test.getTotalVowels(chars));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" Total Vowels are = " + test.getTotalVowels(sc));

	}

	int getTotalVowels(char[] chr) {
		int total = 0;
		VowelsTest test = new VowelsTest();
		for (char temp : chr) {
			if (test.isVowel(temp))
				total = total + 1;
		}
		return total;
	}
	
	
//	int getTotalVowels(Scanner sc) {
//		System.out.println("Enter a String");
//		String str = sc.next();
//		char chars[] = str.toCharArray();
//		int total = 0;
//		VowelsTest test = new VowelsTest();
//		for (char temp : chars) {
//			if (test.isVowel(temp))
//				total = total + 1;
//		}
//		return total;
//	}

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

}
