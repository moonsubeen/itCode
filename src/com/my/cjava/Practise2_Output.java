package com.my.cjava;

public class Practise2_Output {
	
	// ���2
	public static void main(String[] args) {
		
		int a1 = 10;
		
		// Java Style-------------------------------------------
		// 10����
		System.out.print("a1) 10���� : ");
		System.out.println(a1);
		
		// 2����
		System.out.print("a1) 2���� : ");
		System.out.println(Integer.toBinaryString(a1));

		// 8����
		System.out.print("a1) 8���� : ");
		System.out.println(Integer.toOctalString(a1));
		
		// 16����
		System.out.print("a1) 16���� : ");
		System.out.println(Integer.toHexString(a1));
		
		
		// C Style---------------------------------------------
		System.out.printf("a1) 10���� : %d\n", a1);
		System.out.printf("a1) boolean : %b\n", a1); 
		System.out.printf("a1) 8���� : %o\n", a1);
		System.out.printf("a1) 16���� : %x\n", a1);
		
		
		// ETC-------------------------------------------------
		// ������ 2���� �� �ֱ�
		int b1 = 0b11; // (3)
		
		// ������ 8���� �� �ֱ�
		int b2 = 013; // (11)
		
		// ������ 16���� �� �ֱ�
		int b3 = 0x1a; // (26)
		System.out.println("b1) " + b1);
		System.out.println("b2) " + b2);
		System.out.println("b3) " + b3);
	}
}
