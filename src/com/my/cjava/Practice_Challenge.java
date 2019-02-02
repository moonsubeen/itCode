package com.my.cjava;

public class Practice_Challenge {
	public static void main(String[] args) {
//		int a = Integer.parseInt(args[0]);
//		int b = Integer.parseInt(args[1]);
//		
//		System.out.println("곱하기: " + a + " X " + b + " = " + a*b);
//		System.out.println("나누기: " + a + " / " + b + " = " + a/b);
		int n = Integer.parseInt(args[0]);
	    printCombinations(n);

		
	}
	
	private static void printCombinations(int n) {
	    int count = 0;
	    /* 중첩된 반복문과 조건문을 사용하여 코드를 완성하시오. */
//	    for(int i = 1; i<=n; i++)
//	    {
//	    	for(int j = 1; j<=n; j++)
//	    	{ 
//	    		if(n % i ==0)
//	    		{ int k = n/i;
//	    			if(n % j==0) 
//	    			{
//	    			System.out.println(n + " = " + i + " X " + j + " X " + n/j);
//	    			count = count + 1;
//	    			}
//	    		}
//	    	}
//	    }	
	    for(int a =1; a<=n; a++) {
	    	for(int b = 1; b<=n; b++)
	    	{
	    		for(int c =1; c<=n; c++)
	    		{
	    			if(a * b * c == n)
	    			{
	    				count+=1;
	    				System.out.println(n + " = " + a + " X " + b + " X " + c);
	    			}
	    		}
	    	}
	    }
	    System.out.println("======================");
	    System.out.printf("경우의 수: %d\n", count);
	  }
}


