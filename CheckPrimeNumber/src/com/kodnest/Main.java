package com.kodnest;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		checkPrime(n);
	}
	public static void checkPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" "+ "is not prime");
				return;
			}
		}
		System.out.println(n+" "+ "is prime");
	}

}
