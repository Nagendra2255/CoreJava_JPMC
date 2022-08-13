package com.ariba;

 class Overloading1 {
	
	int a; int b;
	
	//Constructor overloading
	public Overloading1()
	{
		System.out.println("Default Constructor");
	}
	public Overloading1(int a)
	{
	System.out.println("Single parameter constructor");	
	}
	public Overloading1(int a, int b)
	{
		System.out.println("two parameterized constructor");
	}
	
	public void add(int a,int b)
	{
		System.out.println("add of 2 int");
	}
	
	public void add(long a,long b)
	{
		System.out.println("add of 2 long");
	}
	
	
	public void check(Object s)
	{
		System.out.println("OBJECT");
	}
	public void check(Character s)
	{
		System.out.println("String");
	}
	
	//Static methods overload
	public static int add(double a,double b)
	{
		System.out.println("add of 2 double");
		return 20;
	}
	public static void add(float a,float b)
	{
		System.out.println("add of 2 float");
	}

}	
		

class Example
{
	public static void main(String[] args) {
		Overloading1 o = new Overloading1();
		//
		//o.add(10.6f,20.3f);
		o.check(null);
}
}
