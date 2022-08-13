package com.divya;

public class Vignan1
{
	public int a;
	private int b;
	protected int c;
	 int d=300;
}

public class Accessspecifiers {
	public int a=1000;
	private int b=2000;
	protected int c=3000;
	 int d=300;

	public static void main(String[] args) {
		Accessspecifiers v = new Accessspecifiers();
		System.out.println(v.a);
		//System.out.println(v.b);
		

	}

}
