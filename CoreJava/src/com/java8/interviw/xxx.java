package com.java8.interviw;
interface HackerEarth
{
	public void work();
	
class Nowork implements HackerEarth
{
	private Nowork()
	{
		System.out.println("No coding in java");
	}
	public void work()
	{
		System.out.println("Code in java");
	}
}
	HackerEarth obj = new Nowork();
}
public class xxx{

	

	public static void main(String[] args) {
		getWork(HackerEarth.obj);
	}

	
	public static void getWork(HackerEarth obj)
	{
		obj.work();
	}

}
