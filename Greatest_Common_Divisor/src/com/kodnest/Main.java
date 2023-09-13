package com.kodnest;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int m=scan.nextInt();
	int n=scan.nextInt();
	findGCD(m,n);
	}
	public static void findGCD(int m,int n)
	{
	while(n!=0)
	{
		int rem=m%n;
		m=n;
		n=rem;
	}
	System.out.println(m);
    }
}
