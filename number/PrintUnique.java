package com.jsp.number;

public class PrintUnique 
{
	public static void check(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=num.length-1;j++)
			{
				if(num[i]==num[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(num[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5,4,5};//1,2,3
		check(num);
	}
}
