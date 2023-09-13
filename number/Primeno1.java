package com.jsp.number;

//print the prime numbers from 1 to n.
public class Primeno1 
{
	public static void Print(int n)
	{
		int count=0;
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
		if(count==2)
		{
			System.out.println(i);
		}
		count=0;
		}
	}

	public static void main(String[] args) 
	{
	Print(10);
	
	System.out.println("-----------------");
	
	Print(100);

	}

}