package com.java8;

//Note: If you don't write @FunctionalInterface, 
//then it will allow any number of abstract methods.

//If you add then compiler will allow only one abstract method and any number of default methods and static methods
@FunctionalInterface
interface Divya
{
	public abstract void abstract1(int a, int b);
	//public abstract void abstract1();//abstract method
	//public abstract void abstract2();
	default void default1()
	{
		System.out.println("DEFAULT METHOD");
	}
	
	static void static1()
	{
		System.out.println("STATIC METHOD");
	}
}

public class FunctionalInterface1 {
	 FunctionalInterface1()
	{
		
	}

	public static void main(String[] args) {
		
		//Lambda Expression-->It is the implementation of Functional interface.
		//Divya d=()->System.out.println("ABSTRACT METHOD IMPLEMENTATION");
		//d.abstract1();
		/*Divya d = (a,b)->int c= a+b;
		d.default1();
		Divya.static1(); */
		

	}
	public static void main(String[] args, String[] args1) {
	}
	

}
