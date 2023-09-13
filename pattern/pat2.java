package com.jsp.pattern;

public class pat2 
{
	public static void main(String[] args) 
	{
		char a ='A';
		int count=2;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i%2==0)
				{
					System.out.print(count + "    ");
					count+=2;
				}
				else
				{
					System.out.print(a + "    ");
					a++;
				}
			}
			System.out.println();
		}
	}
}
