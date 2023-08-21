package com.kodnest;
import java.util.Scanner;
public class ArithmeticOperations 
{
	public static void main(String[] args) 
	{
		 Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the two numbers to subtract");
	     int num1 =scan.nextInt();
	     int num2 =scan.nextInt();
	     System.out.println(subtractNumbers( num1,num2));
	     System.out.println("Enter the two numbers to multiply");
	     num1 =scan.nextInt();
	     num2 =scan.nextInt();
	     System.out.println(multiplyNumbers(num1, num2));
	     System.out.println("Enter the two numbers to devide");
	     Double num3=scan.nextDouble();
	     Double num4 =scan.nextDouble();
	     System.out.println(divideNumbers(num3,num4));
	     System.out.println("Enter the two numbers to get remainder");
	     num1 =scan.nextInt();
	     num2 =scan.nextInt();
	     System.out.println(findRemainder(num1,num2));
	     scan.close();
	}
		public static int subtractNumbers(int num1, int num2)
		{
			return num1-num2;
		}
		public static int multiplyNumbers(int num1, int num2)
		{
			return num1*num2;
		}
		public static double divideNumbers(double num3, double num4)
		{
			return num3/num4;
		}
		public static int findRemainder(int num1, int num2)
		{
			return num1%num2;
		}
}


