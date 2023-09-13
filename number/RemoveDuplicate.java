package com.jsp.number;

public class RemoveDuplicate 
{
	public static void check(int [] num)
	{
		int x=0;
		for(int i=0;i<=num.length-1;i++)
		{
			int count=0;
			for( int j=i+1;j<=num.length-1;j++)
			{
				x++;
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
		System.out.println(x);
	}

	public static void main(String[] args) 
	{
		int [] num= {1,1,2,2,3,4,5,6,5,6};//1,2,5,6;
		check(num);
	}
}
