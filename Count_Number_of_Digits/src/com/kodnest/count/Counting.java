package com.kodnest.count;

public class Counting
{
	int countDigits(int num)
	{
		int count=0;
		while (num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}

}
