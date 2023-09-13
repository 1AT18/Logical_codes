package com.jsp.number;

public class RightRotate 
{
	public static int[] rotate(int[] num)
	{
		int first=num[0];
		for(int i=num.length-1;i>=0;i--)
		{
			if(i+1<=0)
			{
				num[i]=num[i+1];
			}
		}
		num[num.length-1]=first;
		for(int j=num.length-1;j>=0;j--)
		{
			System.out.println(num[j]+" ");
		}
		return  num;
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5};
		rotate(num);
	}
}

