package com.aot.test;

import java.util.Scanner;

public class ReducedString {
	
	public static String reducedString(String str) {
		//     0123456
		//str = LOKDOWN
		int len = str.length();//len = 8
							   //len=7
		
		//Create StringBuilder object
		StringBuilder result= new StringBuilder();
		
		// Always append 0th index character
		result.append(str.charAt(0));//result = L
		
		if(len%2==0) {//even length
			// i=1  1<8[T]
			for(int i=1;i<len;i++) {
				if(i%2!=0) {// index is odd
					result.append(str.charAt(i));//LOK
				}
			}
		}else {//odd length
			for(int i=1;i<len;i++) {
				if(i%2==0) {
					result.append(str.charAt(i));
				}
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		//Test t = new Test();
		System.out.println("Enter String in UpperCase:-");
		String str=sc.nextLine();
		//str = Lockdown
		System.out.println("Reduced String is "+reducedString(str));
	}

}
