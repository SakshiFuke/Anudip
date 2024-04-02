package com.javacore.demo;

import java.util.Scanner;

public class ProgramDemo {

	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the alphabet");
		String input =sc.next().toLowerCase();
		
		boolean upperCase=input.charAt(0)>=65 && input.charAt(0)<90;
		boolean lowerCase=input.charAt(0)>=97 && input.charAt(0)<127;
		boolean vowels=input.equals("a") ||input.equals("e") || input.equals("i") ||input.equals("o") || input.equals("u");
		
		if(input.length()>1)
		{
			System.out.println("Error not a single charactor");
		}
		else if(!(upperCase || lowerCase))
		{
			System.out.println("Error not a letter Enter  uppercase or lowercase");
		}
		else if(vowels)
		{
			System.out.println("Input letter is constant");
		
		}
	}

}
