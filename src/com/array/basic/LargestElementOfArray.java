package com.array.basic;

import java.util.Scanner;

public class LargestElementOfArray {

	public static void main(String[] args) {
		
		System.out.println("Enter the length of Array");
		Scanner sc = new Scanner(System.in);
		int length= sc.nextInt();
		
		
		int arr[] = new int[length];
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("Enter elements in the array ");
			arr[i]= sc.nextInt();
		}
		 
		largestElement(arr);
	}
	
	public static void largestElement(int arr[])
	{
		int largest= 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]> largest)
			{
				largest= arr[i];
			}
		}
		System.out.println("Largest Element = " + largest);
	}

}
