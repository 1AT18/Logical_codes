package com.jsp.number;

//print odd and even no by using switch case.
public class Even_Switch 
{
	public static void print(String option,int n)
	{
		switch(option)
		{
			case "even":
			{
				for(int i=0;i<=n;i+=2)
				{
					System.out.println(i);
				}
			}
			break;
			case "odd":
			{
				for(int i=1;i<=n;i+=2)
				{
					System.out.println(i);
				}
			}
			break;
		}
	}
	public static void main(String[] args) 
	{
	print("even",10);
	System.out.println("---------");
	print("odd",10);

	}
}