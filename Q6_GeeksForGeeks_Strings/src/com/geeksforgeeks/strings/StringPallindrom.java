package com.geeksforgeeks.strings;
import java.util.Scanner;
public class StringPallindrom {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.next();
		char arr1[]=str.toCharArray();
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
        for(int i=0;i<=arr1.length-1;i++)
        {
        	arr2[j]=arr1[i];
        	j--;
        }
        String str1=new String(arr1);
        String str2=new String(arr2);
        if(str1.equals(str2))
        {
        	System.out.println("String is Palindrome");
        }
        else
        {
        	System.out.println("String is not Palindrome");
        }
	}
}
