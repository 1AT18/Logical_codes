package com.jsp.number;

//print the fabonaci series from 1 to n.
public class Fibanoci
{
	public static void print(int n)
	{
		int a=0;
		int b=1;
		int res;
		for(int i=1;i<=n;i++)
		{
			res=a+b;
			System.out.println(res);
			a=b;
			b=res;
		}
	}
	public static void main(String[] args) 
	{
		print(10);
	}
}