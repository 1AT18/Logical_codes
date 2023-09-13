package com.jsp.number;

//import java.util.Scanner;

//Factorial of given number.
public class Factorial 
{
	public static long factorial(int num)
	{
		long fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
//		Scanner sh=new Scanner(System.in);
//		System.out.println("enter the number");
//		int t=sh.nextInt();
//		factorial(t);
//		sh.close();
		System.out.println(factorial(4));
		System.out.println(factorial(8));
	}
}