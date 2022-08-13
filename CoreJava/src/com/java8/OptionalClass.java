package com.java8;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		try
		{
		int c=a/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally");
		}
		System.out.println("After runtime error");
		
		
       // To avoid abnormal termination, we use the Optional class. In the following example, we are using Optional.
        //So, our program can execute without crashing.
		/*String[] words = new String[10];  
        String word = words[5].toLowerCase();  
        System.out.print(word); */
		String[] words = new String[10]; 
        Optional<String> checkNull = 
                Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {  
            String word = words[5].toLowerCase();  
            System.out.print(word);  
        } else  
            System.out.println("word is null");  
        System.out.println("No Abnormal Termination");
        
        checkNull.ifPresent(s->System.out.println(s));
        
        
        //FlatMap
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
    }  
	

}
