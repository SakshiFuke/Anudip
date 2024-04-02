package com.javacore.demo;

public class ArrayInJava4 {

	public static void main(String[] args) {

		int[] a= {12,21,0,5,7};
		int[] b=new int [a.length];
		
		System.arraycopy(a, 0, b, 0, a.length);
		
		for(int i=0;i<b.length;i++)
		{
			//System.out.println(b[i]);
		}
		a[0]=56;
    	System.out.println(a[0]);
    	a[1]=100;
    	System.out.println(a[1]);
    	a[2]=49;
    	System.out.println(a[2]);
    	a[3]=60;
    	System.out.println(a[3]);
    	a[4]=78;
    	System.out.println(a[4]);
    	
		
	}

	// TASK 
	//change the value of an array and see the result
    // print the array

}
