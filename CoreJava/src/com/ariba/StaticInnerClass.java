package com.ariba;

import com.ariba.Outer.Inner;
//STATIC INNER CLASS
//Only inner classes should be static, but not outer classes
//Static inner classes can access only static variables and static methods from outer class. But not non static variables or methods.
class Outer1
{
	int a=10;
	static int b=20;
	public static void static_m1()
	{
		System.out.println("OUTER static M1..");
	}
	
	public void nonStatic_m2()
	{
		System.out.println("OUTER1111 instance  M2   ..");
	}
	
	static class Inner1
	{
		
		public void display() {
			//Outer1 oo= new Outer1();
			System.out.println("a=="+a+"b="+b);
			
			static_m1();
			
			nonStatic_m2();

		}
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {
		//Outer o = new Outer();
		Outer1.Inner1 oi = new Outer1.Inner1();
		oi.display();
	}

}
