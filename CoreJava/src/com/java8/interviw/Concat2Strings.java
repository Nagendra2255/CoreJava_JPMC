package com.java8.interviw;
interface one
{
	public String stringConcat(String s1, String s2);
}

public class Concat2Strings {

	public static void main(String[] args) {
		
		Runnable r = ()->{
			System.out.println("Runnable interface implementation");
		};
		Thread t = new Thread(r);
		t.start();
		
		one o = (x,y)->
		{
			return x+y;
		};
		
		String s = o.stringConcat("Hello", "Welcome");
		System.out.println(s);

	}

}
