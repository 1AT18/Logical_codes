package com.jsp.number;

//import java.util.Scanner;

public class DuplicateElement 
{
	public static void check(int [] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			int count=0;
			for( int j=i+1;j<=num.length-1;j++)
			{
				if(num[i]==num[j])
				{
					count++;
					num[j]=-1;
				}
			}
			if(num[i]!=-1 && count>0)
			{
				System.out.println(num[i]);
			}
		}
	}

	public static void main(String[] args) 
	{
//		Scanner sh=new Scanner(System.in);
//		System.out.println("enter the num");
//		int size=sh.nextInt();
//		int[] num=new int[size];
//		check(num);
//		sh.close();
		
		int [] num= {1,1,2,2,3,4,5,6,5,6};//1,2,5,6;
		check(num);
	}
}
