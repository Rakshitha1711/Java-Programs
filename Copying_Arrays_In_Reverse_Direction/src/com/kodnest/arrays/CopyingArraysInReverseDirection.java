package com.kodnest.arrays;
import java.util.Scanner;
public class CopyingArraysInReverseDirection {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of 1st Array");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr1.length+" Elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("Entered Elements are...");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Elements in Reversed Direction>>>>");
		int arr2[]=new int[arr1.length];
		for(int i=arr2.length-1;i>=0;i--)
		{
			arr2[i]=arr1[i];
			System.out.print(arr2[i]+" ");
		}
		
	}

}
