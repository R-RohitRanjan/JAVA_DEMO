package com.sdetjava.demo;

public class EvenNumberSum {
	public static void main(String[] args) {
		EvenNumberSum evenNum = new EvenNumberSum();
		int total = evenNum.getSumOfEvens(new int[] {10,30,33,57,80,68,99});
		System.out.println(total);
		
		int[] n = {10,30,45,55,67,13,100};
		//evenNum.printArray(n);
		
		int total1 = evenNum.getSumOfEvens(n);
		System.out.println(total1);
	}
	public int getSumOfEvens(int[] numArray) {
		int sum=0;
		for(int number:numArray) {
			if(number%2==0) {
				sum+=number;	
			}
		}
		return sum;	
	}
	
	public void printArray(int[] arrayNum) {
		for(int temp:arrayNum) {
			System.out.println(temp);
		}
	}

}
