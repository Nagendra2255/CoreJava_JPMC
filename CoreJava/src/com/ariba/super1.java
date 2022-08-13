package com.ariba;

//1)In constructor calls,we should use either super or this one. But not both. 
//And in constructor call either super or this should be first
//in method calls we can write any number of this and super calls methods in any order.
class p
{

	p()
	{
		
		this.method2(20,30);
		System.out.println("default constructor");
		
	}
	p(int a)
	{
		System.out.println("one constructor"+a);
	}
	p(int a, int b)
	{
		//this.method2(20,30);
		//this.method1();
		System.out.println("two constructor"+a+"  "+b);
	}
	public void method1()
	{
		
	 //this.method2(20,30);
	
		System.out.println("method 1");
		// this.method3(2);
	}
	public void method2(int a, int b)
	{
		System.out.println("method 2  "+a+"  "+b);
	}
	public void method3(int a)
	{
		System.out.println("method 3  "+a);
	}	
}
class cc extends p
{

	cc()
	{
		
		super.method1();
		//this(10);
		
		//this(10);
		System.out.println("default constructor");
		
	}
	cc(int a)
	{
		System.out.println("one constructor"+a);
	}
	cc(int a, int b)
	{
		//this.method2(20,30);
		this.method1();
		
		System.out.println("two constructor"+a+"  "+b);
	}
	public void method1()
	{
		super();
		
	 //this.method2(20,30);
	 //super.method3(22);
	
		System.out.println("method 1");
		// this.method3(2);
		 //super.method1();
		
	}
	public void method2(int a, int b)
	{
		System.out.println("method 2  "+a+"  "+b);
	}
	public void method3(int a)
	{
		System.out.println("method 3  "+a);
	}
}
public class super1 {

	public static void main(String[] args) {
		
		cc c1 = new cc();
	}

}
