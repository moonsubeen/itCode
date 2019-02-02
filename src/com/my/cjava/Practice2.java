package com.my.cjava;

public class Practice2 {
	public static void main(String[] args) {
		Level1 l1 = new Level1();
		l1.printHelloWorld();
		
		int a1 = 10;
		int a2 = 3;
		char a3 = '+';
		l1.printCalculate(a1, a2, a3);
		
		Integer b1 = new Integer(20);
		Integer b2 = new Integer(2);
		char b3 = '+';
		l1.printCalculate(b1, b2, b3);
		
		l1.printLarge(10,9);
	}
}
