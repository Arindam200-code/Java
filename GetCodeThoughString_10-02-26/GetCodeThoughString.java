package com.aot.test;

import java.util.Scanner;

public class GetCodeThoughString {
	public static int sumOfdigits(int totalLength){
		int sum = 0;
		while(totalLength!=0) {
			int digit = totalLength%10;
			sum+= digit;
			totalLength/=10;
		}
		return sum;
	}
	public static int getSingleDigitPin(String str) {
		// str = "Wipro Technologies"
		String[] words = str.split(" ");
		
		// words[0] = Wipro  words[1] = Technologies
		int totalLength = 0;
		// Step 1: sum of length of each word
		for(String word : words) {
			totalLength = totalLength+word.length();
			
		}
		while(totalLength > 9) {
			totalLength = sumOfdigits(totalLength);
			// totalLength = 8
		}
		
		return totalLength;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Take string input
		System.out.println("enter a string:");
		// str = "Wipro Technologies"
		String str = sc.nextLine();
		
		
		System.out.println("Total length:"+getSingleDigitPin(str));
		
	}

}
