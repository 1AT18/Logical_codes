package com.jsp.number;

//check the given number is prime or not
public class Primeno 
{
	public static void Check(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n + "  is prime number");
		}
		else
		{
			System.out.println(n+"  is not prime number");
		}
	}
	public static void main(String[] args) 
	{
		Check(13);
		Check(10);
	}

}