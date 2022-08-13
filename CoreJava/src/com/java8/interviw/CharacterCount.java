package com.java8.interviw;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
	char c[]= {'a','d','a','g','k','g'};
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	int count=1;
	for(int i=0;i<c.length;i++)
	{
		
		if(!hm.containsKey(c[i]))
			hm.put(c[i], count);
		else
			hm.put(c[i], hm.get(c[i])+1);
	}
	for(Map.Entry<Character, Integer> g:hm.entrySet())
		System.out.println(g.getKey()+"..."+g.getValue());

	}

}
