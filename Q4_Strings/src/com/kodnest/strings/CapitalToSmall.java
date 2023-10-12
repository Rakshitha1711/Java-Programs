package com.kodnest.strings;
import java.util.Scanner;
public class CapitalToSmall {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=scan.nextLine();
		String result=convertCase(input);
		System.out.println(result);
	}
	public static String convertCase(String input)
	{
		char arr[]=input.toCharArray();
	    for(int i=0;i<=arr.length-1;i++)
	    {
	    	int temp=arr[i];
	    	if(temp>=65 && temp<=90)
	    	{
	    		temp=temp+32;
	    	}
	    	else if(temp>=97 && temp<=122)
	    	{
	    		temp=temp-32;
	    	}
	  
	    	arr[i]=(char)temp;
	    }
	    input=new String(arr);
	    return input;
	}
}
