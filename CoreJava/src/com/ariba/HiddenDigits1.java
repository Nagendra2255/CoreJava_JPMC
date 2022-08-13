package com.ariba;

import java.io.*;
import java.util.*; 

public class HiddenDigits1 {
    public static void main(String[] args) throws FileNotFoundException {
		File file = new File(args[0]);
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			String line = in.nextLine(); 
			String result = "";
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i); 
				if (c >= 'a' && c <= 'j') {
					result += c - 'a'; 
				} else if (c >= '0' && c <= '9') {
					result += c; 
				}
			}
			
			if (result.equals("")) {
				System.out.println("NONE");
			} else {
				System.out.println(result);
			}
		}
    }
}