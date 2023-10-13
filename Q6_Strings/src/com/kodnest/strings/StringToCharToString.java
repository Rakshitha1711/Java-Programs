package com.kodnest.strings;
import java.util.Scanner;
public class StringToCharToString {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=scanner.nextLine();
		char arr[]=input.toCharArray();
		System.out.print("The Character you entered is ");
		for (int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		String result=createStringFromCharArray(arr);
		System.out.println("Created String: "+result);

	}
	public static String createStringFromCharArray(char arr[])
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<=arr.length-1;i++)
		{
			sb.append(arr[i]);
		}
		return sb.toString();
	}

}
