package com.geeksforgeeks.arrays;
import java.util.Scanner;
public class ArraysEqualOrNot {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of 1st array");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter a length of 2nd array");
		int arr2[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr1.length+" Elements for 1st array");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter "+arr2.length+" Elements for 2nd array");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		System.out.println("Elements in 1st array");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Elements in 2nd array");
		for(int i=0;i<=arr2.length-1;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		int count=0;
		System.out.println();
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<=arr1.length-1;i++)
			{
				if(arr1[i]==arr2[i])
				{
					count++;
					if(count==arr1.length)
					{
						System.out.println("They are equal");
					}
				}
				
				else
				{
					System.out.println("They are not equal");
					return;
				}
			}
		}
		else
		{
			System.out.println("They are not equal");
		}
	}
}	