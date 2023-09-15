package com.kodnest.p2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		System.out.println("Enter the power");
		int n=scan.nextInt();
		Power p1=new Power();
		int res=p1.raiseToPowerN(num,n);
		System.out.println(res);

	}

}
