package com.aot.test;

import java.util.Scanner;

public class RxC {
	
	public static int findRowsWithMaxOnes(int[][] M,int R,int C) {
		
		int  maxCount=0;
		int  rowIndex=0;
		
		for(int i=0;i<R;i++) {// i=0 => Indicates for 1st row
			int count=0;
			for(int j=0;j<C;j++) {
				if(M[i][j]==1) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount=count;	// maxCount=1
				rowIndex=i; //rowIndex=0
			}
		}
		
		return rowIndex+1;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of row:- ");
		int R =sc.nextInt();
		
		System.out.println("Enter the no. of Coloume:- ");
		int C =sc.nextInt();
		
		int[][] M= new int[R][C];
		
		System.out.println("Enter the Matrix Element");
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				M[i][j]=sc.nextInt();
			}
		}
		
		int result=findRowsWithMaxOnes(M,R,C);
		System.out.println("Result:- ");
		System.out.println(result);
		sc.close();
	}

}
