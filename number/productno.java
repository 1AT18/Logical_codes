package com.jsp.number;

public class productno 
{
	public static int check(int num)
	{
		int product=1;
		while(num>0)
		{
			int rem=num%10;
			product=product*rem;
			num=num/10;
		}
		return product;
	}
	public static void main(String[] args) 
	{
		System.out.println(check(123));
	}
}
