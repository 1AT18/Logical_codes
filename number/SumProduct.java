package com.jsp.number;

//Sum and product of digit (using same loop for both sum and product)
public class SumProduct 
{
	public static void sumproduct(int num)
	{
		int sum=0;
		int multi=1;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			multi=multi*rem;
			num=num/10;
		}
		System.out.println(sum);
		System.out.println(multi);
	}
	public static void main(String[] args) 
	{
		sumproduct(1234);
	}
}