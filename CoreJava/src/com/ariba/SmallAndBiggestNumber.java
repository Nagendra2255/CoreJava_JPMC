package com.ariba;

import java.util.Arrays;

public class SmallAndBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {78, 34, 1, 3, 90, 34, 0, 400, 6, 55, 20, 21};  
		
		Arrays.sort(arr);
		int small=arr[0];
		int big=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(small>arr[i])
				small=arr[i];
			if(big<arr[i])
				big=arr[i];
		}
		System.out.println("Biggest Number--"+big+"Smallest numbber.."+small);
		Arrays.sort(arr);
		for(Integer i: arr)
			System.out.println(i);

	}

}
