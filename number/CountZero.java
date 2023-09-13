package com.jsp.number;

public class CountZero 
{
	public static void check(int num)
	{
		int c=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem==0)
			{
				c++;
			}
			num=num/10;
		}
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		check(300022);
		check(80030003);
	}
}
