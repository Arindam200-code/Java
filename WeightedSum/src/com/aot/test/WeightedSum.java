package com.aot.test;
import java.util.Scanner;
public class WeightedSum {
	
	public static boolean isVowel(char ch) {
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
	}
	
	public static int calculateWeight(String input1,int input2) {
		//           0123.....
		// input1= "Hello World"
		// input2= 0
		int weight=0;
		
		for(int i =0;i<input1.length();i++) {
			char ch= input1.charAt(i); // ch='H',
			if(Character.isLetter(ch)) {
				ch=Character.toLowerCase(ch);// ch = h
				int charWeight=ch-'a'+1; // charWeight = 8
				if(isVowel(ch)) {
					if(input2==1) {
						weight+=charWeight;
					}
				}
				else {//Not a vowel
					weight+=charWeight;
				}
			}
		}
		return weight;
	}
	public static void main(String[] args) {
		System.out.println ("Enter String");
		Scanner sc = new Scanner(System.in);
		String input1=sc.nextLine();
		
		System.out.println("Enter Option");
		int input2 = sc.nextInt();
		
		System.out.println(calculateWeight(input1,input2));

	}

}
