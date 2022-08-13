package com.ariba;

//NON STATIC INNER CLASS

//Non Static INNER CLASS
//Only inner classes should be static, but not outer classes
//Non Static inner classes can access either static and non static methods and variables from outer class.
class Outer
{
	int a=10;
	static int b=20;
	public static void static_m1()
	{
		System.out.println("OUTER static M1..");
	}
	
	public void nonStatic_m2()
	{
		System.out.println("OUTER instance  M1..");
	}
	
	class Inner
	{
		//int static=9;//We can't declare static variables inside non-static inner class
		//From the normal inner inner class, we can access both static and non-static members of outside class.
		public void display() {
			System.out.println("a="+a+"b="+b);
		
			static_m1();
			
			nonStatic_m2();

		}
	}
}
public class NonStaticInnerClass {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		oi.display();
		//oi.m1();
	}

}
