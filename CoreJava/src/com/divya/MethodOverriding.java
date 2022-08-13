package com.divya;

class Parent
{
	int a=20;
	 public void marrage()
	{
		System.out.println("PARENT  marriage");
	}
	public void assets()
	{
		System.out.println("PARENT assets");
	}
}
class Child extends Parent
{
	int a=200;
	
	public void marrage()
	{
		System.out.println("My own marriage");
	}
	public void m3()
	{
		System.out.println("CHILD m3");
	}
	
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		Parent p = new Parent();
		//p.marrage();
		//p.assets();
		
		Child c = new Child();
		c.marrage();
		c.assets();
		System.out.println(c.a);
		
		Parent p1 = new Child();
		System.out.println(p1.a);
		p1.marrage();
		p1.assets();
		//p1.m3();
		
		
	}

}
