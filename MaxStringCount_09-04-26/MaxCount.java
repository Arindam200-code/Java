package com.aot.test;

import java.util.Scanner;

public class MaxCount {

	public static int maxAquaCurtains(String str,int L) {

		int maxCount=0;
		int currentCount=0;

		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				currentCount ++;
			}
			if(((i+1)%L==0)||(i==str.length()-1)) {
				if(currentCount>maxCount) {
					maxCount=currentCount;
				}
				currentCount=0;
			}
		}
		return maxCount;
	}
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();

		int L = sc.nextInt();

		int result = maxAquaCurtains(str,L);
		System.out.println("Result:- "+result);

		sc.close();
	}

}
