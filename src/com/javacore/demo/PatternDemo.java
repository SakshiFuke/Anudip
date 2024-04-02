package com.javacore.demo;
/*
 * 1
 * 22
 * 333
 * 4444
 * */
public class PatternDemo {

	public static void main(String[] args) {

		int row=4;
		//outer for loop number of row
		for(int i=1;i<=row;i++)
		{
			//inner loop
			for(int j=1;j<=i;j++)
			{
				System.out.print(i + " ");
			}
			//move to the next line after each row
			System.out.println();
		}
	}

}
