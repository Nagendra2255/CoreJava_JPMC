package com.ariba;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = {'s','d','a','s','d','f'};
		
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			if(hm.containsKey(ch[i]))
				hm.put(ch[i], hm.get(ch[i])+1);
			else
			hm.put(ch[i],count)	;
		}
		//for(Map.Entry<Character, Integer> c:hm.entrySet())
			//System.out.println(c.getKey()+"..."+c.getValue());
		
		//OTHER APPROACH
		String sss="Welcome to java to learn";
		Map<Character, Integer> mm1=new HashMap<Character, Integer>();
		for(char c: sss.toCharArray())
			mm1.put(c, mm1.containsKey(c)?mm1.get(c)+1:1);
		for(Map.Entry<Character, Integer> n:mm1.entrySet())
			System.out.println(n.getKey()+".."+n.getValue());
		Character cc=mm1.entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
			
		
		System.out.println("????????????????????"+cc);
		
		String str="Welcome to java to learn";
		Map<Character,Integer> map = new HashMap();

		
		  for (Character ch1 : str.toCharArray()) {
	            map.put(ch1, map.containsKey(ch1) ? map.get(ch1) + 1 : 1);
	        }
		  
		  for(Map.Entry<Character,Integer> mm:map.entrySet())
			  System.out.println(mm.getKey()+"..."+mm.getValue());
		  Character cccc= map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
		  System.out.println(cccc);

	}
	

}
