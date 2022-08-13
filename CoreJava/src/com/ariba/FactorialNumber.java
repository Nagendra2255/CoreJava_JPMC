package com.ariba;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int n=6;
		while(n>0)
		{
			fact = fact*n;
			n--;
		}
		System.out.println("The factorial of the given number is.."+fact);
	//using for loop
		int f=6;
		int fact1=1;
		for(int i=1;i<=f;i++)
		{
			fact1=fact1*i;
		}
		System.out.println("For loop..."+fact1);

	}

}
