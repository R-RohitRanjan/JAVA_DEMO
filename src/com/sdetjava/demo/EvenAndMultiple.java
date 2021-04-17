package com.sdetjava.demo;

public class EvenAndMultiple {

	public static void main(String[] args) {
		EvenAndMultiple num = new EvenAndMultiple();
		int[] numArray = { 10, 30, 45, 55, 67, 13, 100 };
		num.getEvensAndMultiplesOfFive(numArray);

	}

	public void getEvensAndMultiplesOfFive(int[] numArray) {
		for (int number : numArray) {
			if (number % 2 == 0 || number % 5 == 0)
				System.out.println(number);
		}
	}

}
