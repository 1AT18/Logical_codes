package com.jsp.number;

//count the sum 
public class Countsum 
{
	public static void count(long num)
	{
		long sum=0;
		while(num>0)
		{
			long rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		String s=Long.toString(sum);
		System.out.println(s.length());
	}
	public static void main(String[] args) 
	{
		count(12345l);
		count(999999999999999999l);
	}

}