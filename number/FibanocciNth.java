package com.jsp.number;

public class FibanocciNth
{
	public static int fib(int n)
	{
		int n1=0;
		int n2=1;
		int n3=0;
//		System.out.print(n1+" "+n2);
		for(int i=3;i<=n;i++)
		{
			n3=n1+n2;
//			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		return n3;
	}
	public static void main(String[] args) 
	{
		System.out.println(fib(10));
	}
}