package com.my.cjava;

public class Level1 {
	public void printHelloWorld()
	{
		System.out.println("Hello World!");
	}
	
	public void printCalculate(int a, int b, char c)
	{
		switch(c)
		{
		case '+' : System.out.println(a+b); break;
		case '-' : System.out.println(a-b); break;
		case '*' : System.out.println(a*b); break;
		case '/' : System.out.println(a/b); break;
		default:
			break;
		}
	}
	
	public void printCalculate(Integer a, Integer b, char c)
	{
		int k1 = a.intValue();
		int k2 = b.intValue();
		if(c == '+')
			System.out.println(k1+k2);
		else if(c == '-')
			System.out.println(k1-k2);
		else if(c == '*')
			System.out.println(k1*k2);
		else if(c == '/')
			System.out.println(k1/k2);
	}
	
	public void printLarge(int a, int b)
	{
		System.out.println(a>b ? a : b);
	}
}
