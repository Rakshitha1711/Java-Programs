package com.geeksforgeeks.array;
import java.util.Scanner;
public class SearchValueInArray {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of an array");
		int arr[]=new int [scan.nextInt()];
		System.out.println("Enter the values ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Enter the number to search");
		int num=scan.nextInt();
		int count =0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(num==arr[i])
			{
				System.out.println("Number is present");
			}
			else
			{
				count++;
				if(count==arr.length)
				{
					System.out.println("Number is not present");
				}
			}
		
	    }
	}

}
	


