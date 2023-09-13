package com.jsp.number;

public class Even 
{
	public static void print(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is even number");
			}
		}
	}
	public static void main(String[] args) 
	{
	//String s="1002";
	//char b=s.charAt(s.length()-1);
	//int a=(int)b;
	//System.out.println(a);
		print(20);
	}
}