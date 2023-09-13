package com.jsp.number;

public class countno 
{
	public static int check( int num)
	{
	int count = 0;
	while(num>0)
	{
		num=num/10;
		count++;
	}
	return count;
    }
	public static void main(String[] args) 
	{
		 System.out.println(check(124526));
	}
}
