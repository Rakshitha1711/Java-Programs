package com.kodnest.methods;

import java.util.Scanner;

public class TheCalculatorDilemma {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("Enter the number between 1-4");
		int num=scan.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("Addition of two numbers is "+(num1+num2));
			break;
		case 2:
			System.out.println("Substarction of two numbers is "+(num1-num2));
			break;
		case 3:
			System.out.println("Multiplication of two numbers is "+(num1*num2));
			break;
		case 4:
			System.out.println("Division of two numbers is "+(num1/num2));
			break;
			default:
				System.out.println("invalid number");
		}
	}
}
