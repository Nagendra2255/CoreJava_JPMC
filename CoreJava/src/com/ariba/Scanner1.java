package com.ariba;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String name= sc.nextLine();
		char c = sc.next().charAt(0);
		int a = sc.nextInt();
		long mobile=sc.nextLong();
		double cp=sc.nextDouble();
		System.out.println("string"+name);
		System.out.println("char"+c);
		System.out.println("int"+a);
		System.out.println("long"+mobile);
		System.out.println("double"+cp);

	}

}
