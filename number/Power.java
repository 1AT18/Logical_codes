package com.jsp.number;

//print the power of given value.
public class Power 
{
	public static int pow(int value, int power)
	{
		int product=1;
		for(int i=1;i<=power;i++)
		{
			product=value*product;
		}
		return product;
	}
	public static void main(String[] args) 
	{
		System.out.println(pow(2, 5));
		System.out.println(pow(2, 10));

		//System.out.println("----------------");

		//System.out.println(Math.pow(2, 5));
	}

}