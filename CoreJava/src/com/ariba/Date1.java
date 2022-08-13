package com.ariba;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		System.out.println(d);
		DateFormat formatter = new SimpleDateFormat("MMM dd,yyyy");
       String today = formatter.format(d);
       System.out.println(today);
		Date date = formatter.parse(today);
		System.out.println(date);
        
	}

}
