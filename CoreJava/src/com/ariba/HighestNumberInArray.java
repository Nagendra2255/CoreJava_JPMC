package com.ariba;

public class HighestNumberInArray {

	public static void main(String[] args) {

		int a[]= {100,200,2,90,67,800,900,656,1200,900};
		int l=a.length;
		int max=a[0];
		for(int i=0;i<l;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Max number is.."+max);
	
	
	//Seconf max number
		//int first=a[0]; int second=a[1];
		int first=0, second=0;
	
	for(int i=1;i<l;i++)
	{
		if(a[i]>first)
		{
			second=first;
			first=a[i];
			
	    }
		
	
	}
	System.out.println("Max first is.."+first+"...second=="+second);
	
	int temp;
	
	//Sorting
	
	for(int i=0;i<l;i++)
	{
		for(int j=i+1;j<l;j++)
		{
			if(a[i]>a[j])
			{
				 temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<l;i++)
	System.out.println(a[i]);

}
}
