package com.java8.interviw;

public class FirstNonRepeatedCharacters {

	public static void main(String[] args) {

		String s="wnagendra";

		
		for(char c1 :s.toCharArray()){
	        if ( s.indexOf(c1) == s.lastIndexOf(c1)) {
	            System.out.println("First non-repeating character is: "+c1);
	            break;
	}
		}
	}

}
