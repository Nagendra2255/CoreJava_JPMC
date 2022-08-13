package com.ariba;

public class FibinocciSeries {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int n=10;
		System.out.println("The fibinoccinumbers are..a."+a+" "+b);
		
		for(int i=2;i<n;i++)
		{
			
		
			int c=a+b;
			a=b;b=c;
			System.out.println(c);
		}
	}

}
