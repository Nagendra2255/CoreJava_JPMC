package com.ariba;

public class StaticMethod {
	int a=10;
	static int b;
	static
	{
		System.out.println("..block"+a);//Static blocks are usied to initilize static data.
	}

	public static void main(String[] args) {
		
		System.out.println("main method...");
		StaticMethod.m1(10);
		//StaticMethod s = new StaticMethod();
		StaticMethod.m1(20);
		//StaticMethod.m2(20);
		
		
	}
	public static void m1(int a)
	{
		System.out.println(a);
	}
	public  void m2(int a)
	{
		System.out.println(a);
	}

}
