package com.ariba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Karthik {

	public static void main(String[] args) throws IOException {
		InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String line;

        while ((line = in.readLine()) != null) {
          System.out.println("......"+line);
            System.out.println(line);
            line = line.trim();
                        String[] split = line. split(",");
                        System.out.println("???"+split[0]);
                        System.out.println(">>>>>"+split[0].endsWith(split[1]));

                        if (split[0].endsWith(split[1])){
                            System.out.println("1");
                            System.exit(0);
                        }
                        else{
                            System.out.println("0");
                            System.exit(0);
                        }
                        }

}}