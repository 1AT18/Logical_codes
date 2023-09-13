package com.jsp.pattern;

public class Pat1 
{
	public static void print(int row,int column)
	{
		for(int i=1;i<=column;i++)
		{
			for(int j=1;j<=column;j++)
			{
				if(i==1 || j==1 || i==row || j==column)
				{
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		print(3,3);
		System.out.println("---------------------");
		print(4,4);
	}
}
