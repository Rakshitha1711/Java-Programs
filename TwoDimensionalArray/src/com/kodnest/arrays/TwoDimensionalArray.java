package com.kodnest.arrays;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st D and 2nd D array length");
		int arr[][]=new int[scan.nextInt()][scan.nextInt()];
		for (int i=0;i<=arr.length-1;i++)
		{
			for (int j=0;j<=arr[i].length-1;j++)
			{
			System.out.println("Enter the marks of class "+i+" Student "+j);
			arr[i][j]=scan.nextInt();
		    }
	    }
		System.out.println("Array contents are");
		for (int i=0;i<=arr.length-1;i++)
		{
			for (int j=0;j<=arr[i].length-1;j++)
			{
			System.out.print(arr[i][j]+" | ");
			}
			System.out.println();
		}
	}

}
