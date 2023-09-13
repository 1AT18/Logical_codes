package com.jsp.number;

public class Fibanoci1
{
	public static void Check(int n,int ele)
	{
		int a=0;
		int b=1;
		int res;
		for(int i=0;i<=n;i++)
		{
			res=a+b;
			if(res==ele)
			{
				System.out.println(res);
			}
			a=b;
			b=res;
		}
	}
	public static void main(String[] args) 
	{
		Check(20,13);
	}

}