package com.my.cjava;

public class Practice_Challenge {
	public static void main(String[] args) {
//		int a = Integer.parseInt(args[0]);
//		int b = Integer.parseInt(args[1]);
//		
//		System.out.println("���ϱ�: " + a + " X " + b + " = " + a*b);
//		System.out.println("������: " + a + " / " + b + " = " + a/b);
		int n = Integer.parseInt(args[0]);
	    printCombinations(n);

		
	}
	
	private static void printCombinations(int n) {
	    int count = 0;
	    /* ��ø�� �ݺ����� ���ǹ��� ����Ͽ� �ڵ带 �ϼ��Ͻÿ�. */
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
	    System.out.printf("����� ��: %d\n", count);
	  }
}


