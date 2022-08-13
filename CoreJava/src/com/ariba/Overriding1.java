package com.ariba;
class A
{
	public A()
	{
		System.out.println("A");
	}
	public void xyz()
	{
		System.out.println("A Method");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("B");
	}
	public void xyz()
	{
		System.out.println("B Method");
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		/*B b = new B();
		b.xyz(); */
		//B b = new A();
		//xyz1('1');
		A a = new B();
		a.xyz();
	}
	/*
	 * public static void xyz1(int i) {
	 * 
	 * } public static int xyz1(int i) {
	 * 
	 * } public static void xyz1(char i) {
	 * 
	 * }
	 */

}
