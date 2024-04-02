package com.javacore.demo;

class Aa
{
	int i;
}

public class feb13ArrayInJava9 {
	static void MethodOne(Aa[] a)
	{
		a[2].i=25;
		a[5].i=45;//changing the value of element at index 5
	}
	public static void main(String[] args) {
		
		Aa[] a =new Aa[8];
		a[2]=new Aa();
		a[5]=new Aa();
		
		a[2].i=10;
		a[5].i=20;
		
		MethodOne(a);//calling method 
		System.out.println(a[2].i);
		System.out.println(a[5].i);
		
	}

}
