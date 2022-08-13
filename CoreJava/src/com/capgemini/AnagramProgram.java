package com.capgemini;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		
		String s1="listen";
		String s2="si1lent";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(s1.length()==s2.length())
		{
			for(int i=0;i<c1.length;i++)
			{
				if(c1[i]!=c2[i])
				{
					
					System.out.println("not");
					break;
				}
				
			}
			System.out.println("yes");
			
				
		}
		else
			System.out.println("NOT");
		
		
	}

}
