package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00 = new Point(3, 5);
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = p02;
		
		
		//equals() 
		System.out.println(p00.equals(p01)); 
		System.out.println(p01.equals(p00)); 
		
		System.out.println(p02.equals(p03)); 
		
		System.out.println(p00 == p01);
	}

}
