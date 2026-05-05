package com.aot.test;

import java.util.Scanner;

public class cruise {
	public static int findMaxGuests(int[] E,int T,int[] L) {
		
		int currentGuests=0;
		int maxGuests=0;
		//[7,0,5,1,3] -> E[]
		//[1,2,1,3,4] -> L[]
		for(int i=0;i<T;i++) {
			currentGuests+=E[i]-L[i];
			//Update maxGuests
			if(maxGuests<currentGuests) {
				maxGuests=currentGuests;
			}
		}
		
		return maxGuests;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of T:- ");
		int T = sc.nextInt();
		
		int[] E = new int[T];
		int[] L = new int[T];
		
		System.out.println("Enter the 1st array element:- ");
		//Input entries
		for(int i=0;i<T;i++) {
			E[i]=sc.nextInt();
		}
		
		System.out.println("Enter the 2nd array element:- ");
		for(int i=0;i<T;i++) {
			L[i]=sc.nextInt();
		}
		
		int result = findMaxGuests(E,T,L);
		System.out.println("Result:- ");
		System.out.println(result);
		sc.close();
	}

}
