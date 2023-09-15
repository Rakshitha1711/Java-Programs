package com.kodnest.p1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		Power p1=new Power();
		int res=p1.raiseToTwo(n);
		System.out.println(res);
	}
	

}
