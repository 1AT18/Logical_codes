package com.jsp.number;

import java.util.Scanner;

public class evenoneton 
{
	int num;
	public static void inc(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sh=new Scanner(System.in);
		System.out.println("enter the number");
		int t=sh.nextInt();
		inc(t);
		sh.close();
//		inc(10);
		
	}
}
