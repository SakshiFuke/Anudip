package com.javacore.demo;

public class ArrayInJava5 {

	public static void main(String[] args) {
		
		double[] [] matrix = {    //instantiation and initilization of two dimension array
				{1.2, 4.3, 4.0},
				{4.1, 1.1}
		};
		/*
		double[] [] matrix1;//declaration of two dimensionall array
		
		double [][] a =new double[3][2]; //instatiation
		
		int [][] a =new int[3][2];
		String [][] a =new String[3][2];
	*/
		int [][] a= {
				{1,2,3},
				{4,5,6,9},
				{7}
					};
		System.out.println("length of row 1"+a[0].length);  //3
		System.out.println("length odf row 2"+a[1].length);  //4
		System.out.println("length odf row 3"+a[1].length);  //1
		System.out.println(a[0][0]); //6
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]); 
		System.out.println(a[1][2]);
		System.out.println(a[1][3]);
		System.out.println(a[2][0]);

		
		//TASK print all the matrix
	}
}
