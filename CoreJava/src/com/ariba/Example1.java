package com.ariba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("AasA"); a1.add("aAsA"); a1.add("AAasA"); a1.add("aasA");
		
		char c ='n';
		c=c+"nnn";
		Collections.sort(a1);
		System.out.println(a1);
		
		String a ="kjkj";
		try
		{
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		}
		catch(NumberFormatException e) {
			System.out.println(a);
		}
		
	}

}
