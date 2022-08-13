package com.capgemini;

public class WeightofTheGivenString {

	public static void main(String[] args) {
		String s="Apple";
		char c[]=s.toCharArray();
		int temp=0;
		for(int i=0;i<c.length;i++)
		{
			switch(c[i])
			{
			case  'A' || 'a':
				temp=temp+1;
				break;
				
		}
	}
		System.out.println(temp);
}

}
