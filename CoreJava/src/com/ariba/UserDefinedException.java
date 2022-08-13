package com.ariba;
class OwnException extends Exception
{
	public OwnException(String s)
	{
		super(s);
		System.out.println("OWN EXCEPTION");
	}
}

public class UserDefinedException {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int age=10;
		if(age<20)
			//throw new OwnException("AgeNotSupportedException");
		throw new Exception("AgeNotSupportedException");

	}

}
