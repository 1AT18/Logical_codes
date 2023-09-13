package com.jsp.number;

//product of digit.
public class Productdigit 
{
	public static void product(int num)
	{
		int multi=1;
		while(num>0)
		{
			int rem=num%10;
			multi=multi*rem;
			num=num/10;
		}
		System.out.println(multi);
	}
	public static void main(String[] args) 
	{
		product(123);
		product(52354);
		product(24336);

	}

}