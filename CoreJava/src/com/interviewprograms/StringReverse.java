package com.interviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) {
		
		String s="Welcome To Java";
		int length=s.length();
		System.out.println(length);
		char c[]=s.toCharArray();
		System.out.println(c.length);
		String s1[]=s.split(" ");
		System.out.println(s1.length);
		
		//String Reverse
		//for(int i=s.length()-1;i>=0;i--)
			//System.out.print(s.charAt(i));//OR
		//System.out.print(c[i]);
		
		//Each word Reverse
		String rev="";
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<s1.length;i++)
		{
			char c1[]=s1[i].toCharArray();
			for(int j=c1.length-1;j>=0;j--)
				//rev=rev+c1[j];
				sb.append(c1[j]);
			sb=sb.append(" ");
		}
		System.out.println(sb);
		
		//Anagrams of strings from list
		
		List<String> res=new ArrayList<String>();
		List<String> lst= new ArrayList<String>();
		lst.add("cold"); lst.add("ocdl"); lst.add("ramesh"); lst.add("hsemar"); lst.add("Nagu"); lst.add("vignan");
		String[] array = lst.toArray(new String[0]);
		String ss[]=lst.stream().toArray(String[]::new);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(ss));
		//System.out.println(array);
		//System.out.println(ss);
		for(String sa:array)
			System.out.print(sa);
		System.out.println();
for(String sa1:ss)
		System.out.print(sa1);

for(int i=0;i<lst.size();i++)
{
	for(int j=i+1;j<lst.size();j++)
	{
		char c1[]=array[i].toCharArray();
		char c2[]=array[j].toCharArray();
		if(c1.length==c2.length)
		{
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean cc =Arrays.equals(c1, c2);
		if(cc)
			res.add(array[i]);	
		}
	}
	}
System.out.println(res);




///swap two strings

String a1="hello999";
String a2="welcome";
a1=a1+a2;//hellowwelcome
a2=a1.substring(0,a1.length()-a2.length());//13-7=6
a1=a1.substring(a2.length());
System.out.println(a1+"....."+a2);




//swap two integers
int a=10, b=3666;
 a=a+b;//13
 b=a-b;//10
 a=a-b;
 System.out.println(a+"....."+b);
 
 
 //String Palindrome or not
 
 
 
 
 String q="welcome";
 char[] qq=q.toCharArray();
 String q1=q;
 char[] q11=q1.toCharArray();
 boolean bn=Arrays.equals(qq,q11);
 System.out.println(bn);


		
	}

}
