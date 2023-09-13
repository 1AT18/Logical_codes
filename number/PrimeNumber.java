package com.jsp.number;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void print(int num)
	{
		for(int i=2;i<=num;i++)
		{
			int count=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		
		Scanner sh = new Scanner (System.in); //classname.membername;
		System.out.println("enter the num");
		int a = sh.nextInt();
		print(a);
		sh.close();
	}

}
