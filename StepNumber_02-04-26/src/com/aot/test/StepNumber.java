package com.aot.test;

import java.util.Scanner;

public class StepNumber {	
	public static String isStepNumber(int n) {//67898
		//Check Single Digit
		if(n>=0 && n<=9) {
			return n+"-false";
		}
		int num = Math.abs(n);// n = 67898
		//Extract the last digit
		
		int prevDigit = num % 10;// prevDigit = 8
		num = num/10;
		
		while(num>0) {
			
			int currentDigit=num%10;//currentDigit=9
			int diff=Math.abs(currentDigit-prevDigit);// diff=1
			if(diff!=1) {
				return n+"-false";
			}
			prevDigit=currentDigit;//prevDigit=9
			num=num/10; //num=678
		}
		return n+"-True";
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int n=sc.nextInt();
		System.out.println(isStepNumber(n));
	}

}
