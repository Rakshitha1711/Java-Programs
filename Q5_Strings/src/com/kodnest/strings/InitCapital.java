package com.kodnest.strings;
import java.util.Scanner;
public class InitCapital {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		String result=capitalizeWords(str);
		System.out.println(result);
	}
	public static String capitalizeWords(String str)
	{
		char arr[]=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			int temp1=arr[0];
			if(temp1>=97 && temp1<=122)
			{
				temp1=temp1-32;
				arr[0]=(char)temp1;
			}
			if(arr[i]==' ')
			{
				 int temp=arr[i+1];
				 if(temp>=97 && temp<=122)
				 {
					 temp=temp-32;
				 }
					arr[i+1]=(char)temp;
			}
			}
		str=new String(arr);
		return str;

	}

}
