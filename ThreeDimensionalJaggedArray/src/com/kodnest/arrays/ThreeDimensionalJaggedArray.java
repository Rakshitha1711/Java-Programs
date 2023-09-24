package com.kodnest.arrays;
import java.util.Scanner;
public class ThreeDimensionalJaggedArray {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of school");
		int arr [][][]=new int[scan.nextInt()][][];
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.println("Enter the number of class in school "+i);
		arr[i]=new int[scan.nextInt()][];
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the number of students in school "+i+" class "+ j);
				arr[i][j]=new int[scan.nextInt()];
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter the marks of Student of school "+i+" class "+j+" Student "+k);
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
