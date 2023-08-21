package com.kodnest.method;
import java.util.Scanner;
public class JourneyCalculatorApp {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre speed and time to calculate distance ");
		double speed = scan.nextDouble();
		double time =  scan.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		double Distance = journeyCalculator.calculateDistance(speed,time);
		System.out.println(Distance);
	}

}
