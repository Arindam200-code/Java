package com.aot.example;

public class FindsStringCode {
	public static int findStringCode(String sentence) {
		//sentence = "World Wide Web"
		String[] words = sentence.split(" ");
		//Words[0] = "World"
		//Words[1] = "Wide"
		//Words[2] = "Web"
	
		StringBuilder result = new StringBuilder();
		//StringBuilder is better than StringBuffer
		//
		//For each loop
		// 1. It is applicable only for arrays and collection.
		// 2. Only Works in Forward Direction. It can't Work in BackWare direction.
		// 
		//Syntax
		// For each word present in Words
		for(String word:words) {
			
			int temp=calculateWordSum(word);//40
			result.append(temp);// 402326
			//Append method present in StringBuffer class as well as StringBuilder class
			
		}
		return Integer.parseInt(result.toString());
	}
	public static int calculateWordSum(String word) {
		//String word="World"
									//0 1 234
		word=word.toUpperCase();// Word => WORLD
		int left = 0;//left index value=0
		int right = word.length()-1;// right index value = 4
		
		int sum=0;
		while(left<right) {//left = 0 right = 0
			int leftValue=word.charAt(left) - 'A'+1;
			int rightValue=word.charAt(right) - 'A'+1;
			
			sum = sum + Math.abs( leftValue - rightValue );
			
			left++;
			right--;
		}
		if(left==right) {
			int middleValue=word.charAt(left)-'A'+1;
			sum=sum+middleValue;
		}
		return sum; // 40 23 26
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="World Wide Web";
		System.out.print(findStringCode(input));
	}
}
