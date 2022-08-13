package com.ariba;

public class BBB {
	public static void main(String args[])
	{

	String str = "nagendra";

	String substring = "gda";

	for (int i=0;i<str.length();i++)
	{
	    //System.out.println( str.charAt( i ));
	    for (int j=0;j<substring.length();j++)
	    {
	        if (str.charAt( i )== substring.charAt( j ))
	        {

	            System.out.println( "found literal :" + str.charAt( i ) +  "::::"+ substring.charAt( j ) +  true );
	        }
	    }
	}
	}
}
	

	
