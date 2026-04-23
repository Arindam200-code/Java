package com.aot.test;

import java.util.Scanner;

public class SumDigit {

	public static int sumOfsumsOfDigit(int num) {//num=582109

		//Convert the input into String
		String str=String.valueOf(num);// 582109 => "582109"

		int result =0;

		for(int i=0;i<str.length();i++) {

			int digit = str.charAt(i)-'0'; // digit = '5' - '0' = 53 - 48 = 5
			result+= digit*(i+1); // 5*1+8*2+2*3+1*4+0*5+9*6
		}
		return result;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Take a input
		System.out.println("Enter the Input:- ");
		int num = sc.nextInt();

		int result= sumOfsumsOfDigit(num);
		System.out.println("Result is :- "+result);

		sc.close();
	}

}
