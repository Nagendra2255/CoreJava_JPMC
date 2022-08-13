package com.ariba;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		for(int i=1;i<=n;i++)
		{
			int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				count = count + 1;
			
				
		}
		if(count==2)
			System.out.println("PrimeNumbers are.."+i);
		
		}

	}

}
