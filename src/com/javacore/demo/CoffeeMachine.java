package com.javacore.demo;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Choose your coffee");
		System.out.println("1. Expresso");
		System.out.println("2. Latte");
		System.out.println("3. Cappuccino");
		System.out.println("4. Mocha");

		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("You choice the expresso , price is 100rs");
			break;
		case 2:
			System.out.println("You choice the Latte , price is 200rs ");
			break;
		case 3:
			System.out.println("You choice the Cappuccino, price is 300rs ");
			break;
		case 4:
			System.out.println("You choice the Mocha ,price is 400rs");
			break;
		default:
			System.out.println("none");


		}
	}

}
