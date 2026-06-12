package com.array.basic;

import java.util.Scanner;

public class SmallestElementOfArray {

	public static void main(String[] args) 
	{
		System.out.println("Enter the length of Array");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		int arr[] = new int[length];
		
		System.out.println("Enter the value of an Array");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]= sc.nextInt();
		}

		smallestElement(arr);
	}

	
	public static void smallestElement(int []arr)
	{
		int smallest= Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]< smallest)
			{
				smallest= arr[i];
			}
		}
		
		System.out.println("The smallest number = "+ smallest);
	}
}
