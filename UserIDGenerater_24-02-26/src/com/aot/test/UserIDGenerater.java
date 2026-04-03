package com.aot.test;

import java.util.Scanner;

public class UserIDGenerater {
	public static String userIdGeneration(String fName, String lName, String id,int n) {
		
		String smaller,longer;
		/* Decide Smaller and Longer Name*/
		if(fName.length()<lName.length()) {
			smaller=fName;
			longer=lName;
		}else if(fName.length()>lName.length()) {
			smaller=lName;
			longer=fName;
		}else {//if first name and last name are of equal length
			if(fName.compareToIgnoreCase(lName)<0) {
				smaller=fName;
				longer=lName;
			}else {
				smaller=lName;
				longer=fName;
			}	
		}
		//		   012
		//smaller='Roy'
		//longer='Rajiv'
		char lastLetter=smaller.charAt(smaller.length()-1);// last letter = y
		char leftDigit=id.charAt(n-1);
		char rightDigit=id.charAt(id.length()-n);
		
		String userId=""+lastLetter+longer+leftDigit+rightDigit;
						//yRajiv75
		StringBuilder sbl=new StringBuilder();
		for(char ch:userId.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				sbl.append(Character.toLowerCase(ch));
			}else if(Character.isLowerCase(ch)) {
				sbl.append(Character.toUpperCase(ch));
			}else {
				sbl.append(ch);
			}
		}
		return sbl.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name:-");
		String fName = sc.nextLine();
		
		System.out.println("Enter Last Name:-");
		String lName = sc.nextLine();
		
		System.out.println("Enter ID in String:-");
		String id = sc.nextLine();
		
		System.out.println("Enter Number:-");
		int n = sc.nextInt();
		
		System.out.println("ID:"+userIdGeneration(fName,lName,id,n));
	}
}
