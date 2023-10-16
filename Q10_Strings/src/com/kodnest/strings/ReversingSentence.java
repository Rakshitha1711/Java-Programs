package com.kodnest.strings;
import java.util.Scanner;
public class ReversingSentence {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		String arr[]=str.split(" ");
		String arr2[]=new String[arr.length];
		StringBuffer fs=new StringBuffer();
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			arr2[j]=arr[i];
			fs.append(arr2[j]+" ");
			j++;
		}
		System.out.println(fs.toString());
	}

}
