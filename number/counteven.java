package com.jsp.number;

public class counteven 
{
	public static int check(int num)
	{
		int count=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				count++;
			}
			num=num/10;
		}
		return count;
	}
	public static void main(String[] args) 
	{

		System.out.println(check(24532));
		System.out.println(check(25176762));
		System.out.println(check(23654867));

	}

}
