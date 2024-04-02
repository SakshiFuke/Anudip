package com.javacore.demo;

public class Feb13ArrayInJava10 {

	static int[] methodOne()
	{
		int [] a= new int[8];
		a[2]=10;
		a[5]=20;
		return a;
	}
	public static void main(String[] args) {
		
		int[] a=methodOne();//calling method
		System.out.println(a[2]);
		System.out.println(a[5]);
	}
	
	
	
}
