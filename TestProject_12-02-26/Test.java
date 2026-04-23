/*Write a  Java program to input a string and returns its second word in upper case.
	Ex- I/p.-1: Wipro Technologies Bangalore
	       O/p.-1: TECHNOLOGY
	         I/p.-2: Champions 2026 League
	         O/p.-2: 2026
	         I/p.-3: Hello
	        O/p.-3: Less
Note-1: If input is a sentence with less than 2 words the method should return the word less
Note-2: The result should have no leading or trailing space.*/
package com.aot.oop;
import java.util.Scanner;
public class Test {
	public static String getSecondUpperCase(String input){
	        //input:Wipro Technologies Bangalore
	        if(input==null){
	            return "LESS";
	        }
	        String[] words=input.trim().split("\\s+");
	        // words[0]=Wipro
	        // words[1]=Technologies
	        // words[2]=Bangalore
	        if(words.length<2){
	            return "LESS";
	        }
	        return words[1].toUpperCase();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter String:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(getSecondUpperCase(input));
	}
}