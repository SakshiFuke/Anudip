package com.javacore.demo;
import java.util.Scanner;	
public class IfDemo {

	public static void main(String[] args)
	{
/*		int i=10;
		if(i<15) {
			System.out.println("inside if statement ");
			System.out.println("10 is less than 15 ");
		}
		else {
			System.out.println("inside if statement ");
			System.out.println("15 is greter than 10 ");
		}*/
		
		//nestedif
		/*int i=10;
		if(i==10) {
			//first if statement 
			if(i<15) {
				System.out.println("i is smaller tham 15");
			}
			if(i<12) {
				System.out.println("i is smaller tham 12");
			}
			else {
			System.out.println("i is greter than 10 ");
			}*/
		
		//int i=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("karo jaldi i ka value print");
		int i = sc.nextInt();
		if(i==10) {
			if(i==10) {
				System.out.println("i is 10");
			}
			else if(i==15) {
					System.out.println("i is 15");

				}
			else if(i==20) {
				System.out.println("i is 20");

			}
			else {
				System.out.println("i is not present");

			}
			
			
		}
	}
	
	

}
