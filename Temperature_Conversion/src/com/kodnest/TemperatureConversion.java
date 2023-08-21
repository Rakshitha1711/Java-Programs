package com.kodnest;
import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) 
	{
		System.out.println("Welcome To The Temperature Conversion Tool");
		System.out.println("Select an Option");
		System.out.println("1. Convert Celsius to Farhrenheit");
		System.out.println("2. Convert Farhenheit to Celsius");
		Scanner scan=new Scanner(System.in);
		System.out.println("Select an Option");
		int num=scan.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("Enter the Temperature in Celsius");
			double celsius=scan.nextDouble();
			System.out.println(celsiusToFarhenheit(celsius));
			break;
		case 2:
			System.out.println("Enter the Temperature in Farhenheit");
			double farhenheit=scan.nextDouble();
			System.out.println( farhenheitTocelsius(farhenheit));
			break;
		default:
			System.out.println("Invalid Option");
		}
	}
   public static double celsiusToFarhenheit(double celsius)
   {
	   return celsius*9/5+32;
   }
   public static double farhenheitTocelsius(double celsius)
   {
	   return celsius*9/5+32;
   }
}
