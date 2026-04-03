package com.aot.oops;

public class Box {
		private double width;
		private double height;
		private double depth;
		public Box(double width, double height, double depth) {
			this.width = width;
			this.height = height;
			this.depth = depth;
		}
		public double getVolume() {
			return width*height*depth;
		}
		public void displayDimension() {
			System.out.println("Width:"+width);
			System.out.println("Height:"+height);
			System.out.println("Depth:"+depth);
		}
}

