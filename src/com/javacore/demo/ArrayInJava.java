package com.javacore.demo;

public class ArrayInJava {

	public static void main(String[] args) {

		int[] a= {12,21,0,5,7};
		int[] b=a;
		
		//printing the data
		for(int i=0; i< b.length; i++)
		{
			System.out.println(b[i]);
			
			a[2]=52;
			System.out.println("=======");
			System.out.println(b[2]);
			
			b[4]=100;
			System.out.println(a[4]);
		}
	
	}
	

}
