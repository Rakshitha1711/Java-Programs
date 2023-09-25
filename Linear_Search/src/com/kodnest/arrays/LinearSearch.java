package com.kodnest.arrays;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of Array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter a key to search");
		int key=scan.nextInt();
		boolean flag=false;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				System.out.println("Key Found at index "+i);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Key not Found....");
		}

	}

}
