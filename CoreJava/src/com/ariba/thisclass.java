package com.ariba;

//Constructor call must be the first statement in a constructor. Both are wrong, compiletime error
/*
 *thi()
	{
		this(20);
		System.out.println("default constructor");
		this(20,30);
	}  OR
	
	thi()
	{
		this(20);
		this(20,30);
		System.out.println("default constructor");
		
	}
 */
//From methods, we can't call this class constructors..Like below
/*
 public void method1()
	{
		this();
	System.out.println("method 1");
	
	}
 */
//Note: this() or this(10) or this(20,30)-->All constructor calls should be only in constructors, 
//but not in method.But from methods we can call constructors.
//Only one constructor call from constructor. We can't write multiple this constructor calls from one constructor.
//From methods we can use any number of this methods and in any order like first or last.  like below
/*public void method1()
{
	
 this.method2(20,30);

	System.out.println("method 1");
	 this.method3(2);
} */

class thi
{
	thi()
	{
		
		
		//this(20);
		this(20,30);
		System.out.println("default constructor");
		
	}
	thi(int a)
	{
		System.out.println("one constructor"+a);
	}
	thi(int a, int b)
	{
		this.method2(20,30);
		this.method1();
		System.out.println("two constructor"+a+"  "+b);
	}
	public void method1()
	{
		//this();
	 this.method2(20,30);
	
		System.out.println("method 1");
		 this.method3(2);
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

public class thisclass {

	public static void main(String[] args) {
		thi t =new thi();
	}

}
