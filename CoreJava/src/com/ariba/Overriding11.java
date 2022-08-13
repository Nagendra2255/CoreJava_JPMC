package com.ariba;

import java.io.IOException;

//variable resolution will be taken care by compiler based on reference.
class Parent
{
	int a=10;
	static int b=20;
	public void parentm1()
	{
		System.out.println("parentm1...");
	}
	public void parentm3()
	{
		System.out.println("parentm3...");
	}

	/*private void parentprivate()
	{
		System.out.println("parentprivate...");
	}
	public void parentm2()
	{
		System.out.println("parentm2...");
	}
	public static void parentm9()
	{
		System.out.println("parentm9 static...");
	}
	public static void parentm99()
	{
		System.out.println("parentm99 static...");
	} */
	
}

class Child extends Parent
{
	int a=100;
	static int b=200;
	public void parentm1()
	{
		System.out.println("child m1...");
	}
	public void parentm2()
	{
		System.out.println("child m2...");
	}
	public void parentm4()
	{
		System.out.println("childm4...");
	}
	/*public void childm3()
	{
		System.out.println("child m3...");
	}
	public static void parentm99()
	{
		System.out.println("child99 static...");
	}
	private void parentprivate()
	{
		System.out.println("parentprivate...");
	}*/
	
	
}


public class Overriding11 {

	public static void main(String[] args)throws IOException
	{
		
		try
		{
		Parent p = new Parent();
		System.out.println(p.a+"..."+p.b);
		p.parentm1(); 
		p.parentm3();
		//p.parentm3();
		Child c = new Child();
		System.out.println(c.a+"..."+c.b);
		c.parentm1();
		c.parentm2();
		c.parentm3();
		c.parentm4();
		
		Parent p1 = new Child();
		System.out.println(p1.a+"..."+p1.b);
		p1.parentm1();
		//p1.parentm2();
		p1.parentm3();
		//p1.parentm4();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

		
		
		/*
		 * Parent p = new Child(); System.out.println("a==="+p.a+"b==="+p.b);
		 * p.parentm1(); p.parentm2(); p.parentm9(); p.parentm99(); p.parentm999();
		 * p.parentprivate(); ((Child) p).childm3();
		 */
	}

}
