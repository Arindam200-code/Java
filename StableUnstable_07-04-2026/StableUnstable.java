package com.aot.test;

import java.util.Scanner;

public class StableUnstable {
	
public static boolean isStable(int num) {
		
		int[] freq=new int[10];
		
		//count frequency of each digit
		while(num>0) {
			int digit=num%10;// digit =2     1
			freq[digit]++;
			num/=10; //  num=1    0
		}
		int expectedFreq=0;
		// check if all non zero frequencies are equal
		for(int i=0;i<10;i++) { // i=2  
			if(freq[i]>0) {//freq[2]=>0
				if(expectedFreq==0) {
					expectedFreq=freq[i];//expectedFreq=1
				}else if(freq[i]!=expectedFreq){ //1!=1
					return false;
				}
			}
		}
		return true;
	}
	// 12,1313, 122,678,898
	public static  int findPassword(int input1,int input2,int input3,int input4,int input5) {
		
		//Create an array with these inputs
		int[] inputs= {input1,input2,input3,input4,input5};
		
		int stableSum=0;
		int unstableSum=0;
		// 12,1313, 122,678,898
		for(int num : inputs) {// num=12
			if(isStable(num)) {
				stableSum+=num;
			}else {
				unstableSum+=num;
			}
		}
		return stableSum-unstableSum;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st input:- ");
		int input1=sc.nextInt();
		
		System.out.println("Enter 2nd input:- ");
		int input2=sc.nextInt();
		
		System.out.println("Enter 3rd input:- ");
		int input3=sc.nextInt();
		
		System.out.println("Enter 4th input:- ");
		int input4=sc.nextInt();
		
		System.out.println("Enter 5th input:- ");
		int input5=sc.nextInt();
		
		int result = findPassword(input1,input2,input3,input4,input5);
		
		System.out.println("Password"+" "+result);
	}
}
