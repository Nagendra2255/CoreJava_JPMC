package com.capgemini;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatewordsFromString {

	public static void main(String[] args) {
		String s="Good day bye bye";
		String arr[]=s.split(" ");
		Set<String> set=new HashSet<String>();
		StringBuilder temp = new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		for(String s1 :set)
			temp.append(s1+" ");
		System.out.println(temp);
	}

}
