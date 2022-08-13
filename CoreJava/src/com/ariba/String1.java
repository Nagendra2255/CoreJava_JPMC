package com.ariba;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="hello";
String s2 = new String("hello");
System.out.println(s1==s2);
System.out.println(s1.equals(s2));//false, true

String s3= new String("hello");
String s4 = new String("hello");
System.out.println(s1==s2);
System.out.println(s3.equals(s4)); //false, true

String s5= "hello";
String s6 = "hello";
System.out.println(s5==s6);
System.out.println(s5.equals(s6));//true, true

String s7 = "Welcome to Java";

//REVERSE OF STRING
/*
 * for(int i=s7.length()-1;i>=0;i--) System.out.print(s7.charAt(i));
 */

//REVERSE OF EACH WORD
String c[]=s7.split(" ");
String rev=" ";

for(int i=0;i<c.length;i++)
{
	String temp = c[i];
	String sx=" "; 
for(int j=temp.length()-1;j>=0;j--)
{
	sx = sx+temp.charAt(j);
}
rev= rev+sx;
	
}
System.out.println(rev);


	}

}
