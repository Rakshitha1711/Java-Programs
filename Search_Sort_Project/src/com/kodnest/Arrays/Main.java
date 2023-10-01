package com.kodnest.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a length of Array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		KodnestSearchSort kss=new KodnestSearchSort();
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		while(true)
		{
			System.out.println("Enter your Choice");
			System.out.println("Press 1-------> Searching");
			System.out.println("Press 2-------> Sorting");
			System.out.println("Press 3-------> Finding Minimum Or Maximum");
			System.out.println("Press Any Other-------> TATA BYE BYE....");
			int choice =scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Press 1-----> Linear Search");
				System.out.println("Press 2-----> Binary Search");
				int choice1=scan.nextInt();
				if(choice1==1)
				{
					System.out.println("Enter a key to Search");
					int key=scan.nextInt();
					int res=kss.linearSearch(arr,key);
					if(res>=0)
					{
						System.out.println("Key found at "+res);
					}
					else
					{
						System.out.println("Key not found");
					}
				}
				else if(choice1==2)
				{
					System.out.println("Enter a key to Search");
					int key=scan.nextInt();
					int res=kss.binarySearch(arr,key);
					if(res>=0)
					{
						System.out.println("Key found at "+res);
					}
					else
					{
						System.out.println("Key not found");
					}
					
				}
				else
				{
					System.out.println("Go to vasan Eye Care and Come Back");
				}
				break;
			case 2:
				System.out.println("Press 1-----> Bubble Sort");
				System.out.println("Press 2-----> Selection Sort");
				System.out.println("Press 3-----> Insertion Sort");
				int choice2=scan.nextInt();
				if(choice2==1)
				{
					
					System.out.println("Enter 1 for Ascending and Enter 2 for Descending");
					int choice3=scan.nextInt();
					if(choice3==1)
					{
						kss.bubbleSortAscending(arr);
						System.out.println("Elements after sorting");
						for(int i=0;i<=arr.length-1;i++)
						{
							System.out.print(arr[i]+" ");
						}
						
					}
					else if(choice3==2)
					{
						kss.bubbleSortDescending(arr);
						System.out.println("Elements after sorting");
						for(int i=0;i<=arr.length-1;i++)
						{
							System.out.print(arr[i]+" ");
						}
					}
					else
					{
						System.out.println("Go to vasan Eye Care and Come Back");
					}
				}
				else if(choice2==2)
				{
					System.out.println("Enter 1 for Ascending and Enter 2 for Descending");
					int choice3=scan.nextInt();
					if(choice3==1)
					{
						kss.selectionSortAscending(arr);
						System.out.println("Elements after sorting");
						for(int i=0;i<=arr.length-1;i++)
						{
							System.out.print(arr[i]+" ");
						}
					}
					else if(choice3==2)
					{
						kss.selectionSortDescending(arr);
						System.out.println("Elements after sorting");
						for(int i=0;i<=arr.length-1;i++)
						{
							System.out.print(arr[i]+" ");
						}
					}
					else
					{
						System.out.println("Go to vasan Eye Care and Come Back");
					}
				}
				else if(choice2==3)
				{
					System.out.println("Enter 1 for Ascending and Enter 2 for Descending");
					int choice3=scan.nextInt();
					if(choice3==1)
					{
						kss.insertionSortAscending(arr);
						System.out.println("Elements after sorting");
						for(int i=0;i<=arr.length-1;i++)
						{
							System.out.print(arr[i]+" ");
						}
					}
					else if(choice3==2)
					{
						kss.insertionSortDescending(arr);
						System.out.println("Elements after sorting");
						for(int i=0;i<=arr.length-1;i++)
						{
							System.out.print(arr[i]+" ");
						}
					}
					else
					{
						System.out.println("Go to vasan Eye Care and Come Back");
					}
					
				}
				else
				{
					System.out.println("Go to vasan Eye Care and Come Back");
				}
				break;
			case 3:
				System.out.println("Press 1----->Finding Minimum");
				System.out.println("Press 2----->Finding Maximum");
				int choice4=scan.nextInt();
				if(choice4==1)
				{
					int res=kss.findMinimum(arr);
					System.out.println("Minimum number is "+res);
				}
				else if(choice4==2)
				{
					int res=kss.findMaximum(arr);
					System.out.println("Maximum number is "+res);
				}
				else
				{
					System.out.println("Go to vasan Eye Care and Come Back");
				}
				break;
			default:
				System.out.println("TATA BYE BYE...");
				
			}
			return;
		}
	}
}
