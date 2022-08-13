
package com.divya;
import java.util.*;

//Writing two or more methods with the same name and difference in the method parameters like number of argumens and order..

//It does not bother about return1 type and accessspecifier..Means you can write equal or different
class MethodOverloaingSameClass
{
	public void method1(double a)
	{
		System.out.println("int");

	}


	
	

}


public class MethodOverloading {

	public static void main(String[] args) {
		
		//byte b=10;
		//int c=10;
		//byte x=10;
		char c='b';
		byte b1=127;
		
		MethodOverloaingSameClass m = new MethodOverloaingSameClass();
		m.method1(c);
	
	
		
	}

}
