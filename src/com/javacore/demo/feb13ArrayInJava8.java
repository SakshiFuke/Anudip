package com.javacore.demo;
//passing array of a primitive type as a parameter to the method:
public class feb13ArrayInJava8 {
	static void MethodOne(double d[])
	{
		d[2]=25.35;
		d[5]=45.35;//changing the value of element at index 5
	}
	public static void main(String[] args) {

		double[] d=new double[8];
		d[2]=10.25;
		d[5]=15.25;//changing the value of element at index 5
		
	}

}
