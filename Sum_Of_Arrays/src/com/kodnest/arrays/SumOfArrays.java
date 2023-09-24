package com.kodnest.arrays;
import java.util.Scanner;
public class SumOfArrays {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of Array");
		int arr[]=new int[scan.nextInt()];
		int sum=0;
		System.out.println("Enter "+arr.length+" Elements to Add");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);

	}

}
