package com.java8.interviw;

public class Runnable1 {

	public static void main(String[] args) {
	
		Runnable r = ()->System.out.println("Runnable interface implementation");
		Thread t = new Thread(r);
		t.start();

	}

}
