package com.kodnest.arrays;
import java.util.Scanner;
public class OneDimensionalArray
{
	public static void main(String[] args)
	{
			    Scanner scan=new Scanner(System.in);
				System.out.println("Enter a length of 1D array");
				int arr[]=new int [scan.nextInt()];
				for(int i=0;i<=arr.length-1;i++)
				{
					System.out.println("Enter an element "+i);
					arr[i]=scan.nextInt();
				}
				System.out.println("Array contents are");
				for(int i=0;i<=arr.length-1;i++)
				{
					System.out.print(arr[i]+" | ");
			    }
				System.out.println();
	}

}


	


