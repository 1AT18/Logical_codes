package com.jsp.number;

import java.util.Scanner;

public class FibanocciNno 
{
	public static void fib(int n)
	{
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n1+" "+n2);
		for(int i=3;i<=n;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sh=new Scanner(System.in);
		System.out.println("enter the number");
		int t=sh.nextInt();
		fib(t);
		sh.close();
		
		
//		fib(5);
	}
}
