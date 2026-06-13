package com.array.basic;

import java.util.Scanner;

public class Check_Sorted_Or_Rotated_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = sc.nextInt();
		int arr[]= new int[length];	
		
		System.out.println("Enter the array Element");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		
       boolean res= checkArray(arr);
       System.out.println(res);

	}
	
	public static boolean checkArray(int[] nums) 
    {
        int count = 0;
        for(int i=0 ; i<nums.length-1 ; i++)
        {
           if(nums[i] > nums[i+1])
           {
             count++;
           }

           if(count==1 && nums[0]>nums.length-1)
           {
            return true;
           }

           if(count==0)
           {
            return true;
           }
        }
       return false;

    }

}
