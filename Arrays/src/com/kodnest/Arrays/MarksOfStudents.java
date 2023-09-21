package com.kodnest.Arrays;
import java.util.Scanner;
public class MarksOfStudents
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int res=scan.nextInt();
		int []arr=new int[res];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter a Marks of student "+i);
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Student marks are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" | ");
		}


	}

}
