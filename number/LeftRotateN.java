package com.jsp.number;

public class LeftRotateN 
{
	public static int[] rotate(int[] num,int n)
	{
		for(int k=1;k<=n;k++)
		{
		int first=num[0];
		for(int i=0;i<=num.length-1;i++)
		{
			if(i+1<=num.length-1)
			{
				num[i]=num[i+1];
			}
		}
		num[num.length-1]=first;
		}
		for(int j=0;j<=num.length-1;j++)
		{
			System.out.println(num[j]+" ");
		}
		return  num;
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5};
		rotate(num,4);
	}
}
