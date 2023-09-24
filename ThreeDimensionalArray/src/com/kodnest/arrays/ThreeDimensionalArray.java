package com.kodnest.arrays;
import java.util.Scanner;
public class ThreeDimensionalArray {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of 1st D and 2nd D and 3rd D lengths");
		int arr[][][]=new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("enter the elements");
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("Array contents are....");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.print(arr[i][j][k]+" | ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
