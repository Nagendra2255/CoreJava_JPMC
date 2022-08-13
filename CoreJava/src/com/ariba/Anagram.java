package com.ariba;

import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		
List<String> lst = Arrays.asList("listen","silent","triangle","integral","soap","babu");

List<String> result=new ArrayList<String>();
for(int i=0;i<lst.size();i++)
{
	for(int j=i+1;j<lst.size();j++)
	{
		char c1[]=lst.get(i).toCharArray();
		char c2[]=lst.get(j).toCharArray();
		if(c1.length==c2.length)
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean b=Arrays.equals(c1,c2);
			
				
			if(b)
			result.add(lst.get(i));
			else
				break;
		}
		
	}
}
	for(String s: result)
		System.out.println(s);
}

	}


