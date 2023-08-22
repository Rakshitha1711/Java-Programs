package com.kodnest;

import java.util.Scanner;

public class Main {
	public static void printEvenNumbers(int n)

	{
      for(int i=2;i<=n;i=i+2)
       {
    	  System.out.println(i);
    	  continue;
       }
	

	}

	public static void main(String[] args)

	{

    Scanner scan=new Scanner(System.in);
    int n= scan.nextInt();
    printEvenNumbers(n);

}

	
}
