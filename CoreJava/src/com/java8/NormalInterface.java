package com.java8;

abstract class Divya
{
	
}

interface Bank
{
	public  abstract void rateOfIntrest();
	public  abstract void withdraw();
}

class SBIBank implements Bank
{
	public void rateOfIntrest()
	{
		System.out.println("SBIBank ROI IS 12%");
	}
	
	public void withdraw()
	{
		System.out.println("SBIBank WITHDRAW..");
	}
}

class HDFCBank implements Bank
{
	public void rateOfIntrest()
	{
		System.out.println("HDFC ROI IS 10%");
	}
	
	public void withdraw()
	{
		System.out.println("HDFC WITHDRAW..");
	}
}

public class NormalInterface {

	public static void main(String[] args) {
		Bank b = new SBIBank();
		b.rateOfIntrest();
		b.withdraw();
		
		Bank b1 = new HDFCBank();
		b1.rateOfIntrest();
		b1.withdraw();
	}

}
