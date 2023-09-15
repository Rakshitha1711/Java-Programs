package com.kodnest.p2;

public class Power {
	int raiseToPowerN(int num,int n)
	{
	   int finalresult=1;
		for(int i=1;i<=n;i++)
		{
			finalresult=finalresult*num;
		}
		return finalresult;
	}

}
