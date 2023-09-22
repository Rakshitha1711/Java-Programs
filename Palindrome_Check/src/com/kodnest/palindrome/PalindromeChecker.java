package com.kodnest.palindrome;

public class PalindromeChecker 
{
	public boolean palindromeCheck(int num)
	{
		int original=num;
		int m=0;
		int n=0;
		while(num>0)
		{
		m=num%10;
		num=num/10;
		n=n*10+m;
		}
		if(n==original)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
