package com.ariba;
class test1 implements Runnable
{
	public int zaehler;
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10_00_000;i++)
			++zaehler;
		
	}
	
}

public class StringReverse {

	public static void main(String[] args) throws InterruptedException {
		test1 t1 = new test1();
		test1 t2 = new test1();
		Thread tt=new Thread(t1);
		Thread tt1=new Thread(t2);
		tt.start();
		tt.join();
		tt1.join();
		System.out.println(t1.zaehler);
		
		// TODO Auto-generated method stub
		String s="WELCOME TO JAVA HAPPY";
		
		/*
		 * //Reverse of entire string using StringBuffer 
		 * StringBuffer sb=new
		 * StringBuffer(); 
		 * for(int i=s.length()-1;i>=0;i--) 
		 * { 
		 * sb.append(s.charAt(i));
		 *  OR sb=sb.append(s.charAt(i)); }
		 * System.out.println("REVERSE OF THE STRING IS.."+sb);
		 */
		
		//Reverse of entire string using String
		/*String sb=" ";
				
				 * for(int i=s.length()-1;i>=0;i--) { sb=sb+(s.charAt(i)); }
				 * System.out.println("REVERSE OF THE STRING IS.."+sb);
				 */
		
		//REVERSE OF EACH WORD
		
		/*
		 * String s1[]=s.split(" "); 
		 * String rev=" "; 
		 * for(int i=0;i<s1.length;i++)
		 *  {
		 * String temp =s1[i]; 
		 * String sx=" "; 
		 * for(int j=temp.length()-1;j>=0;j--) {
		 * sx=sx+temp.charAt(j); 
		 * } 
		 * rev=rev+sx;
		 *  } 
		 *  System.out.println(rev);
		 */
		
		//SWAP OF 2 STRINGS WITHOUT USING 3RD VARIABLE
		
		String s1="hai";//3
		String s2="hello";//5
		System.out.println("BEFORE SWAPPING.."+s1+"..."+s2);
		
		s1=s1+s2;//haihello--8
		s2=s1.substring(0, s1.length()-s2.length());//0,8-5//hai
		s1=s1.substring(s2.length());
		System.out.println("AFTER SWAPPING..."+s1+"...."+s2);
		final int a[]= new int[5];
		a[3]=4;
		System.out.println(a[3]);
		
		String sss[]= {"a","2.0","3","EiP"};
		
		
		
		
		String s12="Hello World";
		String s123[]=s12.split(" "); 
		String temp=" "; 
		 for(int i=0;i<s123.length;i++)
		   {
			 char c[]=s123[i].toCharArray();
			 for(int j=c.length-1;j>=0;j--)
				 temp=temp+c[j];
		   }
		 System.out.println(temp);
		
	}

}
