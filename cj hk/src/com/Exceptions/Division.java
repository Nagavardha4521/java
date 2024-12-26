package com.Exceptions;

import java.util.Scanner;

public class Division 
{
	/*public static void main(String [] args)
	{
		 int a=Integer.parseInt(args[0]);
		 int b=Integer.parseInt(args[1]);
		 int c=a/b;
		 System.out.println(c);
	}*/
	public static void main(String [] args)  //String srgs[];
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
		   System.out.println("Result:"+c);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please enter two integers as below");
			System.out.println("java division 10 5");
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("please enter only integers");
		}
		catch(ArithmeticException e)
		{
			System.out.println("please don't enter Zero as second value");
		}
		
		
	}
	 
     
}
