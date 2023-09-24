package com.kodnest.arrays;
import java.util.Scanner;
public class SelectionSort {

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
        System.out.println("Elements before Sorting....");
        for(int i=0;i<=arr.length-1;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        new Sorting().sort(arr);
        System.out.println();
        System.out.println("Elements after sorting");
        for(int i=0;i<=arr.length-1;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        

	}

}
