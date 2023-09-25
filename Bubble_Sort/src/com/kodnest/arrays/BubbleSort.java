package com.kodnest.arrays;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Elements before sorting...");
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			for(int i=0;i<=arr.length-2;i++)
			{
				for(int j=0;j<=arr.length-2-i;j++)
				{
					if(arr[j]>arr[j+1])
					{
						int help=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=help;
								
					}
				}
		}
			System.out.println("Elements after sorting...");
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.print(arr[i]+" ");
			}
	}

}
