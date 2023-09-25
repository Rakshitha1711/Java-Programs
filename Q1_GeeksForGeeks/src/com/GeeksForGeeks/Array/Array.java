package com.GeeksForGeeks.Array;

import java.util.Scanner;

public class Array 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=scan.nextInt();
		int []arr=new int[size];
		for(int a=0;a<arr.length;a++)
		{
			System.out.println("Enter an elements");
			arr[a]=scan.nextInt();
			
		}
		System.out.println("elements.....>>>");
		for(int a=0;a<arr.length;a++)
		{
			System.out.print(arr[a]+" ");
		}
	}
}
