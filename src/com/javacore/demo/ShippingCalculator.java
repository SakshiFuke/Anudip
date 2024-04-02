package com.javacore.demo;

import java.util.Scanner;

public class ShippingCalculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("1. standrand shipping");
		System.out.println("2. Express shipping");
		System.out.println("3. night Shipping");
	
		int shippngMethod=sc.nextInt();
		int baseCost=10;
		switch(shippngMethod)
		{
		case 1:
			System.out.println("You choice the ");
			break;
		case 2:
			System.out.println("You choice the Latte , price is 200rs ");
			baseCost=20;
			break;
		case 3:
			System.out.println("You choice the Cappuccino, price is 300rs ");
			baseCost=30;
			break;
		default:
			System.out.println("Invalid Shipping Method");
		}
		int totalCost=baseCost;
			
	}

}
