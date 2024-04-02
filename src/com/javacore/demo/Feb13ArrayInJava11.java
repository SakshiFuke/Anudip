package com.javacore.demo;

class A
{
	int i;

	@Override
	public String toString() {
		return "A [i=" + i + "]";
	}
	//@Override-->//right click //source //genarate toString() 

}
public class Feb13ArrayInJava11 {

	static A[] methodOne()
	{
		A[] a=new A[8];
		a[2]=new A();//created object
		a[5]=new A();
		a[2].i=10;
		a[5].i=20;
		return a;
		
	}
	public static void main(String[] args) {

		A[] a=methodOne();
		System.out.println(a[2]);
		System.out.println(a[5]);
	}

}
