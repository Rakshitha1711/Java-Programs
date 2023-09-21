package com.kodnest.arrays;
import java.util.Scanner;
public class NameOfEmployee 
{

	public static void main(String[] args)
			{
				Scanner scan=new Scanner(System.in);
				String emp[]=new String[8];
				for(int i=0;i<emp.length;i++)
				{
					System.out.println("Enter the names of the Employees "+i);
					emp[i]=scan.next();
				}
				System.out.println("Names--->>");
				for(int i=0;i<emp.length;i++)
				{
					System.out.print(emp[i]+" ");
					
				}
				

			}

}

	


