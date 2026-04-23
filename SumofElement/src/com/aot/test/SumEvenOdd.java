package com.aot.test;
import java.util.Scanner;
public class SumEvenOdd {
	public static int reducedArrCount(int[] arr,int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			if(n%2==0) {// If the length of Array is of even length
				if(i%2!=0) { // check if index is odd
					sum+=arr[i];//Taking 
				}
			} // end of if
			else {// If the length of Array is of odd length
				if(i%2 != 0) { // odd index
					sum += 1;
				}
				else { // even index
					sum+=arr[i];
				} // end of inner else
			} // end of else
		}// end of for loop
		
		int ans = 1+(sum-1)%9;
		return ans;
	}
	public static void main(String[] args) {
		// create Scanner class object
		
		Scanner sc = new Scanner(System.in);

		//size of the array
		System.out.println("Enter the size:- ");
		int n=sc.nextInt();
		
		//Take an Array
		int arr[]= new int[n];
		System.out.println("Enter the Array elements:- ");
		
		//input Array
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int result = reducedArrCount(arr,n);
		System.out.println("The single digit answer is: "+result);
		sc.close();
	}

}
