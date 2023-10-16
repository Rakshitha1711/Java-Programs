package com.kodnest.strings;
import java.util.Scanner;
public class ReverseEachWordInString {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
        String arr[]=str.split(" ");
        String revSentence="";
        for(int i=0;i<=arr.length-1;i++)
        {
        	String word=arr[i];
        	String revWord="";
        	for(int j=word.length()-1;j>=0;j--)
        	{
        		revWord=revWord+word.charAt(j);
        	}
        	revSentence=revSentence+revWord+" ";
        }
        System.out.println("Reversed String is");
        System.out.println(revSentence);
	}
}