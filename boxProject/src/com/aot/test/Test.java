package com.aot.test;

import com.aot.oops.Box;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box myBox=new Box(10.5,5.0,4.0);
		
		//Displaying Dimensions of the box
		System.out.println("Box Dimension:");
		myBox.displayDimension();
		
		double volume = myBox.getVolume();
		System.out.println("Volume of the box is :"+volume);
	}
}