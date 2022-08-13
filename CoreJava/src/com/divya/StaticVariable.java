package com.divya;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Static1
{
	//Instance Variable
	 int instanceVariable;
	//Static Variable
	 static int staticVariable;
	 
	 //Instance Method
	 public void instanceMethod()
	 {
		 System.out.println("Instance method");
	 }
	//static Method
	 public static void staticMethod()
	 {
		 System.out.println("static method");
	 }
	 //default constructor, default values
	 public Static1()
	 {
		 System.out.println("Default construuctor...");
	 }
	 
	 
	 //two Parameterized constructor
	 public Static1(int a , int b)
	 {
		 instanceVariable=a;
		 staticVariable=b;
		 System.out.println("two parameterized construuctor");
	 }
	 //one Parameterized constructor
	 public Static1(int a)
	 {
		 instanceVariable=a;
		 
		 System.out.println("one parameterized construuctor");
	 }
	 
	 
}

public class StaticVariable {

	public static void main(String[] args) {
		
		Static1 s = new Static1(20,300);
		Static1 s1 = new Static1(300);
		
		
		System.out.println(s.instanceVariable);
		s.instanceMethod();
		System.out.println(Static1.staticVariable);
		Static1.staticMethod();
		
		

	}
		
}
