package com.sdetjava.demo;

public class TotalSpaceInString {

	public static void main(String[] args) {
		TotalSpaceInString space = new TotalSpaceInString();
		String str = "Persistent Systems: A global solutions company";
		int totalSpace = space.getTotalSpaceInString(str);
		System.out.println(totalSpace);

	}

	public int getTotalSpaceInString(String str) {
		int i = 0, count = 0;
		while (i < str.length()) {
			if (str.charAt(i) == ' ') {
				count++;
			}

			i++;

		}
		return count;

	}

}
