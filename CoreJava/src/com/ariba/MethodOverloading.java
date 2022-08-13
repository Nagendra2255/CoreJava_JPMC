package com.ariba;

public class MethodOverloading {
	
	public void m1(String s)
	{
		System.out.println("string");
	}
	public void m1(int s)
	{
		System.out.println("int");
	}
	public void m1(Integer s)
	{
		System.out.println("Integer");
	}

	public static void main(String[] args) {
		MethodOverloading o = new MethodOverloading();
		//o.m1(null);
		System.out.println(test());
		o.m1(6);
	}
	public static int test()
	{
		try
		{
			int a=6;
			return a;
		}
		finally
		{
			int a=20;
			return 20;
		}
	}
	

}
