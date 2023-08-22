package com.kodnest.BoilerPlate;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		factor(n);
	}
	public static void factor(int n)
	{
		int sum=1;
	   for(int i=1;i<=n;i++)
	   {
		   sum=sum*i;
	   }
	   System.out.println(sum);
	}
}

