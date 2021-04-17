package com.sdetjava.demo;

public class TotalCharInString {

	public static void main(String[] args) {
		TotalCharInString totalChar = new TotalCharInString();
		String str = "PersistentSystem";
		int c = totalChar.getTotalCharacterInString(str);
		System.out.println("The total number of characters present in " + str + " is" + c);

	}

	public int getTotalCharacterInString(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}
		return count;

	}

}
