package com.jsp.number;

public class CircularPrime 
{
	public static String check(int num)
	{
		if(num==0)
		{
			return "Not circular prime";
		}
		int c=0;
		int t=num;
		while(t>0)
		{
			c++;
			t=t/10;
		}
		for(int i=1;i<=c;i++)
		{
			int res=prime(num);
			if(res==1 && num>=2)
			{
				int rem=num%10;
				int r=num/10;
				num=rem*(int)Math.pow(10,c-1)+r;
			}
			else
			{
				return "Not circulat prime";
			}
		}
		return "circular prime";
	}
	public static int prime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%2==0)
			{
				return 0;
			}
		}
		return 1;
	}

	
	public static void main(String[] args) 
	{
		System.out.println(check(197));
	}
}