package com.geeksforgeeks.strings;
import java.util.Scanner;
public class InsertStringIntoAnotherString {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Original String");
		String originalString=scan.nextLine();
		System.out.println("Enter a String to be insert");
		String insertingString=scan.nextLine();
		System.out.println("Enter a Index to insert a String");
		int index=scan.nextInt();
		for(int i=0;i<=originalString.length()-1;i++)
		{
			if(i==index)
			{
				StringBuffer sb=new StringBuffer(originalString);
				sb.insert(index+1, insertingString);
				System.out.println(new String(sb));
			}
		}
	}

}
