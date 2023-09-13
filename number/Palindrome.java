package com.jsp.number;

public class Palindrome 
{
	public static void check(int num)
	{
		int temp =num;
		int res=0;
		while(temp>0)
		{
			int rem=temp%10;
			res=temp*10+rem;
			temp=temp/10;
		}
		if(num==res)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	public static void main(String[] args) 
	{
	check(123);
	}
}