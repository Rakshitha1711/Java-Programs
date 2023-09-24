package com.kodnest.arrays.level2;
import java.util.Scanner;
public class MergingOfElements {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of 1st Array");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter the length of 2nd Array");
		int arr2[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr1.length+" Elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter "+arr2.length+" Elements");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		int arr3[]=new int[arr1.length+arr2.length];
		int i=0;
		for(int j=0;j<=arr1.length-1;j++)
		{
			arr3[i]=arr1[j];
			i++;
		}
		for(int j=0;j<=arr2.length-1;j++)
		{
			arr3[i]=arr2[j];
			i++;
		}
		System.out.println("Array1>>");
		for(int j=0;j<=arr1.length-1;j++)
		{
			System.out.print(arr1[j]+" ");
		}
		System.out.println();
		System.out.println("Array2>>");
		for(int j=0;j<=arr2.length-1;j++)
		{
			System.out.print(arr2[j]+" ");
		}
		System.out.println();
		System.out.println("Array3>>>");
		for(int j=0;j<=arr3.length-1;j++)
		{
			System.out.print(arr3[j]+" ");
		}

	}

}
