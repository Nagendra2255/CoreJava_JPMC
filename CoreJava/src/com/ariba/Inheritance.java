package com.ariba;

import java.io.IOException;



class parent
{
	int a=10;
	protected void m1() throws ArithmeticException
	{
		System.out.println("parent m1");
	}
	public void m2()
	{
		System.out.println("parent m2");
	}
	
}

class child extends parent
{
	int a=20;
	public  void m1()throws  RuntimeException
	{
		System.out.println("child m1");
	}
	public void m3()
	{
		System.out.println("child m3");
	}
}

public class Inheritance {
	public static void main(String args[]) throws Exception
	{
		
	 parent p=new parent();
	 p.m1();//parent m1
	 p.m2();//parent m2
	 
		child p1 = new child();
		p1.m1();//child m1
		p1.m2();//parent m2
		p1.m3();//child m3
	
	
	parent p2 = new child();
	p2.m1();//child m1
    p2.m2();//parent m2
	p2.m3();//Compile time error. We can't access child
	//class own methods by using super class reference
	
	
	}

}
