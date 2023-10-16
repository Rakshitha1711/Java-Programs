package com.kodnest.strings;
import java.util.Scanner;
public class SubString {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i, j));
			}
		}

	}

}
