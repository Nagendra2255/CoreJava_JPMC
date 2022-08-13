package com.ariba;
class a
{
	
}
class b extends a
{
	
}
class c extends b
{
	
}

public class PyramidShape {

	public static void main(String[] args) {
		// Size of the pyramid
	    int n = 5;
	    int i, j;
	   
	    for(i = n; i >= 1; i--)
	    {
	   
	        for(j = i; j < n; j++)
	        {
	            System.out.print(" ");
	        }
	 
	        for(j = 1; j <= (2 * i - 1); j++)
	        {
	            System.out.print("*");
	        }
	
	        System.out.println("");
	    } 
	}
	
	int a[]=0;
	int a1[]=null;
	}