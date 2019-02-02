package com.my.cjava;

import java.util.Scanner;

public class Practise9_Switch {
	public static void main(String[] args) {
		/*************************
		 * switch(비교 대상) {
		 * case 비교값1:
		 * 	  내용1
		 *   break;
		 * case 비교값2:
		 *   내용2
		 *   break;
		 * default:
		 *   내용
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
		
		
		// [실습1] "[Practise8_While] Do ~ While를 사용하는 예제"를
		// Switch ~ Case문을 사용해서 바꿔보기
		
		
		/*************************
		 * (참고) "비교대상"의 가능한 Type (Java 1.7 기준)
		 * 
		 * char, byte, short, int
		 * Character, Byte, Short, Integer
		 * String, Enum
		 *************************/
	}
}
