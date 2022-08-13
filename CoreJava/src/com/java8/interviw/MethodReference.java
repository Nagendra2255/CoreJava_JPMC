package com.java8.interviw;

class Implementation
{
	Implementation()
	{
		System.out.println("CONSTRUCTOR IMPLEMENTATION");
	}
	
	public int instanceMethod(int a)
	{
		System.out.println("INSTANCE METHOD IMPLEMENTATION");
		return 10;
	}
	
	public static int staticMethod(int a, int b)
	{
		System.out.println("STATIC METHOD IMPLEMENTATION");
		return 20;
	}
}

interface Reference
{
	public void instanceMethod1(int a);
	//Implementation getMesage();
	
	public static void staticMethod1(int a, int b);
}

public class MethodReference {

	public static void main(String[] args) {
		 Implementation imp = new Implementation();
		Reference r = imp::instanceMethod;
		r.instanceMethod1(10);
		
		Reference r1 = Implementation::staticMethod;
		r.instanceMethod1();
		
		/*Reference r1 = Implementation::new;
		r1.getMesage();*/
		

	}

}
