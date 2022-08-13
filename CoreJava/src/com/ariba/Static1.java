package com.ariba;

import java.util.*;
import java.io.*;
 static java.lang.Math.*;
import static java.lang.System.*;
class static2
{
	int a=10;//instance varibale
	static int b=80;
	public void instanceMethod()
	{
		System.out.println("Instance Method");
	}
	
	public static void staticMethod1()
	{
		System.out.println("Static method");
	}
}

public class Static1 {
	
public static void main(String[] args)throws IOException {
	ArrayList s = new ArrayList();
	
	
	
	static2 s1 = new static2();
	out.println(s1.a);
	s1.instanceMethod();
	
	out.println(s1.b);
	s1.staticMethod1();
	out.println("Square Rooot"+sqrt(12));
	out.println("abs Rooot"+absExact(10));
		//System.out.println(static2.a);
		static2.staticMethod1();


}
}
