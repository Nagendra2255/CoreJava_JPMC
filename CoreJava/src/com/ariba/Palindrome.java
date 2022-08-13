package com.ariba;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=434;
		int p=n;
		int rev=0;
		while(n>0)
		{
			int temp =n%10;
			rev=(rev*10)+temp;
			n=n/10;
			
		}
		if(rev==p)
			System.out.println("Given number is palindrome.."+rev);

	}

}
