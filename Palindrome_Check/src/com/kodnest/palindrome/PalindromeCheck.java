package com.kodnest.palindrome;
import java.util.Scanner;
public class PalindromeCheck {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=scan.nextInt();
		boolean res =new PalindromeChecker().palindromeCheck(num);
		if(res==true)
		{
			System.out.println("Entered number is palindrome");
		}
		else
		{
			System.out.println("Entered number is not palindrome");
		}
		

	}
}

