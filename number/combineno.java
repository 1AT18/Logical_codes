package com.jsp.number;

import java.util.Scanner;

//Combine the given 2 num
//take two args as user input both of them are integer type, combine 2nd input with 1st input.
public class combineno 
{
	public static void combine(int n1, int n2)
	{
		int count=0;
		int t1=n2; // re-initailing n2 because, In while loop n2 value will loose
		while(t1>0)
		{
			t1=t1/10;
			count++;
		}
		int product=1;
		for(int i=1;i<=count;i++)
		{
			product=product*10;
		}
		int res=n1*product+n2;
		System.out.println(res);
	}

	public static void main(String[] args) 
	{
		Scanner sh=new Scanner(System.in);
		System.out.println("enter the num");
		int t=sh.nextInt();
		int l=sh.nextInt();
		combine(t,l);
		sh.close();
//		combine(133, 67);
//		combine(1444, 123);

	}

}

