package com.java8;

interface one
{
	default void m1()
	{
		System.out.println("Default one implementation");
	}
	static void m2()
	{
		System.out.println("static one implementation");
	}

	
}

interface two
{
	default void m1()
	{
		System.out.println("Default two implementation");
	}
	static void m2()
	{
		System.out.println("static twoo implementation");
	}
	
}



public class FIUse implements one,two{
	
	public void m1()
	{
		two.super.m1();
		System.out.println("main");
	}

	public static void main(String[] args) {
		FIUse f = new FIUse();
		f.m1();
		
		// TODO Auto-generated method stub
		//one o=()->System.out.println("Defauult");
		//o.m1();
		
		String s1="Nagendra"; String s2="Nagendra"; String s3="Nagendra";
		String s4=s2;
		s2="divya";
		System.out.println(s4);
		

	}

}
