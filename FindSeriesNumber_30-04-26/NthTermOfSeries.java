package com.aot.test;

import java.util.Scanner;

public class NthTermOfSeries {
	
	public static int findNthTerm(int n) {
		
		if(n%2!=0) {
			int power = n/2;
			return (int) Math.pow(2, power);
		} else {
			int power = n/2 - 1;
			return (int) Math.pow(3, power);
		}
	}
	public static int input(Scanner sc) {
		System.out.println("ENter the value of n:- ");
		int n = sc.nextInt();
		return n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =input(sc);
		int result = findNthTerm(n);
		
		System.out.println("Result:- ");
		System.out.println(result);
		sc.close();
	}

}
