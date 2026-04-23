package com.aot.test;
import java.util.Scanner;
public class vehicles {

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		
		//take a input
		System.out.print("Enter no. of vehicle");
		int n = sc.nextInt();
		
		int[] temp = new int[n];
		for(int i=0;i<n;i++) {
			temp[i]=sc.nextInt();
		}
		System.out.println("Enter Date:- ");
		int D=sc.nextInt();
		
		int finecount = 0;
		
		System.out.println("Enter fine in repuees:- ");
		int X=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			if((D%2==0 && temp[i]%2!=0)||(D%2!=0 && temp[i]%2==0)) {
				finecount+=X;
			}
		}
		System.out.print("Total Fine collected : "+finecount);
	}

}
