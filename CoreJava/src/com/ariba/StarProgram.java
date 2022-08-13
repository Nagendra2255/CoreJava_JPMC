package com.ariba;

public class StarProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		/* 
		   * * * * * 
		   * * * * 
		   * * * 
		   * * 
		   * 
		  
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(n-i);j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		} */
		/*
		* 
		* * 
		* * * 
		* * * * 
		* * * * * 
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		*/
		/*
	  * 
     * * 
    * * * 
   * * * * 
  * * * * * 
		 
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		} */
		/*
		 
	*
   ***
  *****
 *******
*********
		 
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<(2*i)-1;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		} */
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

		
		String s1 ="Hello";
		String s2 = new String(s1);
		String s3="HELLO";
		System.out.println(s1.equals(s2)+".."+s2.equals(s3));
	}

}
