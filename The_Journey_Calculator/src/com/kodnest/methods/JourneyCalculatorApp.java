package com.kodnest.methods;
import java.util.Scanner;
public class JourneyCalculatorApp {
	public static void main(String []args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Eneter the values of speed and time to calculate the distance");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
	JourneyCalculator journeycalculator=new JourneyCalculator();
	double distance=journeycalculator.calculateDistance(speed,time);
	System.out.println(distance);
	scan.close();
	}
}
