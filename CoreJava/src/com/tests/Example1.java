package com.tests;

import java.util.TreeSet;

class a
{
	private int id;
	private String name;
}

public class Example1 {

	void m1()
	{
		try
		{
			this.wait();
		}
		catch(InterruptedException e)
		{
			
		}
	}
	synchronized void m2()
	{
		this.m1();
	}

	public static void main(String[] args) {
	
		a c=new a();
		c.m2();

	}

}
