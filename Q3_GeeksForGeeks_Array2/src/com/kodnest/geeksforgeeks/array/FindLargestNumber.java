package com.kodnest.geeksforgeeks.array;
import java.util.Scanner;
public class FindLargestNumber {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an array length");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		int compare=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>=compare)
			{
				compare=arr[i];
			}
		}
		System.out.println("Highest number is :"+compare);

	}

}
