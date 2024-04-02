package com.demo;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		int result , a=10, b=0;
		try
		{
			result=a/b;
			System.out.println("result" +result);
		}
		
		catch(NullPointerException e)
		{
			System.out.println("no value in the variable");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("division by 0 is not possible");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("not in range");
		}
		catch(StringIndexOutOfBoundsException ae)
		{
			System.out.println("String not in range");
		}
		catch(Exception e)
		{
			System.out.println("mai hu na exception handle karne ke liye");
		}
		finally
		{
			System.out.println("close all the connections");
		}
		System.out.println("bacha hua code execute hoge");
	}

}
