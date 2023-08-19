package com.kodnest.methods;
import java.util.Scanner;
public class TemperatureConverterApp {
	public static void main(String[] args)
	{
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Temperature in fahrenheit");
    double fahrenheit=scan.nextDouble();
    TemperatureConverter temperatureConverter=new TemperatureConverter();
    double celcius=temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
    System.out.println(celcius);
    scan.close();
	}

}
