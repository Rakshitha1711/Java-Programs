package com.kodnest.BoilerPlate;
public class Main {
	public static void identifyCharacter(char ch)

	{
 if(Character.isLowerCase(ch))
		{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Lower case vowel");
		}
		else
		{
			System.out.println("Lower case consonant");
		}
		}
else if(Character.isUpperCase(ch))
		{
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				System.out.println("upper case vowel");
		}
			else
			{
				System.out.println("upper case consonant");
			}
		}
else if(Character.isDigit(ch))
         {
			System.out.println("digit");
		 }  
else
         {
	System.out.println("Special character");
         }
{
	
}
	}

	public static void main(String[] args)

	{

	identifyCharacter('a');

	}

	}

