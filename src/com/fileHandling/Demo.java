package com.fileHandling;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println(" Enter your name");
		
		String name=scr.next();
		
		System.out.println(" Enter you age ");
		int age=scr.nextInt();
		
		System.out.println(" Welcome "+name +" Age  is :"+age);
		
		
	}
}
