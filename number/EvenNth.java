package com.jsp.number;

import java.util.Scanner;

public class EvenNth
{
	public static void nnn(int n)
	{
		int x=2;
		int res=0;
		for(int i=1;i<=n;i++)
		{
			res=x;
//			System.out.print( x +" ");
			x=x+2;
		}
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		Scanner sh =new Scanner(System.in);
		System.out.println("enter the number");
		int a=sh.nextInt();
		nnn(a);
		sh.close();
	}
}
