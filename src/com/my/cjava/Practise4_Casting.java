package com.my.cjava;

public class Practise4_Casting {
	
	//  캐스팅(형변환, 명시적/묵시적) 
	public static void main(String[] args) {
		
		// int --> ?
		//-----------------------------------------------------------
		// int --> float
		int a1 = 257;
		float a2 = a1;
		System.out.println("a2) " + a2);
		
		// int --> double
		double a3 = a1;
		System.out.println("a3) " + a3);
		
		// int --> byte
		byte a4 = (byte) a1;
		System.out.println("a4) " + a4);
		
		// int --> char
		char a5 = (char) a1;
		System.out.println("a4) " + a5);
		
		// float --> ?
		//-----------------------------------------------------------
		// float --> int
		float b1 = 257.14f;
		int b2 = (int) b1;
		System.out.println("b2) " + b2);
		
		// float --> byte
		byte b3 = (byte) b1;
		System.out.println("b3) " + b3);
		
		// 상수 --> ?
		//-----------------------------------------------------------
		// 2진수 상수 --> int
		int c1 = 0b0011;
		System.out.println("c1) " + c1);
		
		// 8진수 상수 --> int
		int c2 = 013;
		System.out.println("c2) " + c2);
		
		// 16진수 상수 --> int
		int c3 = 0x1a;
		System.out.println("c3) " + c3);
	}
}
