package com.javacore.demo;

import java.util.Arrays;

public class ArrayInJava3 {

	public static void main(String[] args) {

		int[] a= {12,21,0,5,7};
		int[] b=a.clone();
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		a[2]=56;
		System.out.println(b[2]);
		
    	b[4]=100;
    	System.out.println(a[4]);
	}

}
