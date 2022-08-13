package com.ariba;

public class PalindromeNuumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=451;
		int rev=n;
		int palin=0;
		//int temp;
		while(n>0)
		{
			int temp = n%10;
			palin=(palin*10)+temp;
			
			n=n/10;
			
		}
		if(palin==rev)
			System.out.println("Palindrome");

	}

}
