package com.aot.test;

import java.util.Scanner;

public class EvenOddZeroes {
	public static String createRequiredString(int input) {
		//Special case: Input is 0
		if(input==0) {
			return "pz";
		}
		StringBuilder result=new StringBuilder();
		//Prefix based on sign
		if(input>0) {
			result.append('p');
		}else {
			result.append('n');
		}
		
		//Convert the numver into absolute number
		int num=Math.abs(input);
		
		//Convert the number to String
		String digits=String.valueOf(num);
		//16338 => "16338"
		
		for(int i=0;i<digits.length();i++) {
			
			char ch=digits.charAt(i);
			//ch='1'
			int d=ch-'0';//'1'-'0' =>49-48=1
			if(d==0) {
				result.append('z');
			}else if(d%2==0) {
				result.append('e');
			}else{
				result.append('o');
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:-");
		int n=sc.nextInt();
		
		System.out.println("Result:-"+createRequiredString(n));
	}

}
