package com.kodnest.arrays;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Element");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter a key to search");
		int key=scan.nextInt();
		int res=new SearchApp().search(arr, key);
		if(res>0)
		{
			System.out.println("key found at the index "+res);
		}
		else
		{
			System.out.println("Key not found");
		}
	}

}
