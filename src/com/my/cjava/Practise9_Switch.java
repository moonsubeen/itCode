package com.my.cjava;

import java.util.Scanner;

public class Practise9_Switch {
	public static void main(String[] args) {
		/*************************
		 * switch(�� ���) {
		 * case �񱳰�1:
		 * 	  ����1
		 *   break;
		 * case �񱳰�2:
		 *   ����2
		 *   break;
		 * default:
		 *   ����
		 *   break;
		 * }
		 *************************/
		Scanner scan = new Scanner(System.in);
		int a;
		a = scan.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("it's 1.");
			break;
		case 2:
			System.out.println("it's 2.");
			break;
		default:
			System.out.println("it's default value.");
			break;
		}
		
		
		// [�ǽ�1] "[Practise8_While] Do ~ While�� ����ϴ� ����"��
		// Switch ~ Case���� ����ؼ� �ٲ㺸��
		
		
		/*************************
		 * (����) "�񱳴��"�� ������ Type (Java 1.7 ����)
		 * 
		 * char, byte, short, int
		 * Character, Byte, Short, Integer
		 * String, Enum
		 *************************/
	}
}
