package com.kodnest.count;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		Counting c=new Counting();
		int digits=c.countDigits(num);
		System.out.println("Number of digits in "+num +" is "+digits);

	}

}
