package com.sdetjava.demo;

import java.util.Scanner;

public class FibonacciNumberSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FibonacciNumberSeries series = new FibonacciNumberSeries();
		series.getFibonacciSeries(sc);
		

	}
	public int getFibonacciSeries(Scanner sc) {
		int total=0,number1=1,number2=1;
		System.out.println("Enter any Number:");
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
		return total;
		
	}

}
