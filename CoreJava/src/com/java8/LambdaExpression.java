package com.java8;

interface one1
{
	public String sum(int a , int b);
	//public String sum(int a , int b,int c);
}

public class LambdaExpression
{

	public static void main(String[] args)
	{
		
		one1 o = (a,b)->
		{
			//System.out.println(a+b);
			int c =a+b;
			return "c";
		};
		//System.out.println(o.sum(10, 20));
		String x =o.sum(30,80);
		System.out.println(x);
		
	}
}


