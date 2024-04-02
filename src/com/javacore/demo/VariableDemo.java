package com.javacore.demo;

public class VariableDemo {
	int marks1;
	public void displayMarks() {
		int marks1 =0;	
		marks1=marks1+100;
		//marks1=0+100
		//marks=100
		System.out.println("My marks are="+marks1);
	}
	
	
	public static void main(String[] args) {
		VariableDemo vd= new VariableDemo();//creating an object
		vd.displayMarks();
	}

}
