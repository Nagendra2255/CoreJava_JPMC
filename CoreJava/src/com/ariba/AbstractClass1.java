package com.ariba;

//The class abstract1 can be either abstract or final, not both
//final abstract class  abstract1
//The abstract method method1 in type abstract1 can only set a visibility modifier, one of public or protected
//public final abstract void method1();

//Concrete methods we can write final methods. //public final void method2(int a)
abstract class  abstract1
{
	int a=10;
	static int b=20;
	final int c=90;
	public abstract void method1();
	public final void method2(int a)
	{
		System.out.println("Welcome..."+a);
	}
	
	public abstract1()
	{
		System.out.println("Default constructor");
	}

	public abstract1(int a)
	{
		System.out.println("parameterized constructor"+a);
	}
	
}

class my extends abstract1
{
	int a =900;
	my()
	{
		super(999);
	}
	public void method1()
	{
		System.out.println("subclass implementation");
	}
	public  void method2(int b)
	{
		System.out.println("Welcome..."+a);
	}
}

public class AbstractClass1 {

	public static void main(String[] args) {
		abstract1 a = new my();
		a.method1();
		a.method2(10);

	}

}
