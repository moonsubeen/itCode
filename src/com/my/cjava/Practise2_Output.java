package com.my.cjava;

public class Practise2_Output {
	
	// 출력2
	public static void main(String[] args) {
		
		int a1 = 10;
		
		// Java Style-------------------------------------------
		// 10진수
		System.out.print("a1) 10진수 : ");
		System.out.println(a1);
		
		// 2진수
		System.out.print("a1) 2진수 : ");
		System.out.println(Integer.toBinaryString(a1));

		// 8진수
		System.out.print("a1) 8진수 : ");
		System.out.println(Integer.toOctalString(a1));
		
		// 16진수
		System.out.print("a1) 16진수 : ");
		System.out.println(Integer.toHexString(a1));
		
		
		// C Style---------------------------------------------
		System.out.printf("a1) 10진수 : %d\n", a1);
		System.out.printf("a1) boolean : %b\n", a1); 
		System.out.printf("a1) 8진수 : %o\n", a1);
		System.out.printf("a1) 16진수 : %x\n", a1);
		
		
		// ETC-------------------------------------------------
		// 변수에 2진수 값 넣기
		int b1 = 0b11; // (3)
		
		// 변수에 8진수 값 넣기
		int b2 = 013; // (11)
		
		// 변수에 16진수 값 넣기
		int b3 = 0x1a; // (26)
		System.out.println("b1) " + b1);
		System.out.println("b2) " + b2);
		System.out.println("b3) " + b3);
	}
}
