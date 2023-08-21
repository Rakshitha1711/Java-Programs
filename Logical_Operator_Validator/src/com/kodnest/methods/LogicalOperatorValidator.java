package com.kodnest.methods;
import java.util.Scanner;
public class LogicalOperatorValidator {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("is input valid(true/false)");
		boolean isValidInput=scan.nextBoolean();
		System.out.println("Does input meet a certain condition(true/false");
		boolean meetCondition=scan.nextBoolean();
		if( isValidInput&&meetCondition==true)
		{
			System.out.println("input is valid");
		}
		else
		{
			System.out.println("input is invalid");
		}
	}
   public static boolean isValidInput(boolean isValidInput,boolean meetCondition)
   {
	   return isValidInput && meetCondition;
   }
}
