package com.my.cjava;

import java.util.Scanner;

public class Practise3_Input {

	// 입력
	public static void main(String[] args) {
		
		// 입력------------------------------------------------
		// ※ scan.nextLine()을 적는 이유 ? 
		// 이전 명령에서 쳤던 엔터('\n')가 버퍼에 남아 있기 때문에, 이 값을 지운 것이다.
		
		Scanner scan = new Scanner(System.in);
		
		// 정수
		int a1 = scan.nextInt();
		System.out.println("a1) 입력받은 값은 " + a1 + "입니다.");
		
		// 소수
		double a2 = scan.nextDouble();
		System.out.println("a2) 입력받은 값은 " + a2 + "입니다.");
		
		// 문자열 (공백문자 : ' '까지) // 단어만 사용가능
		scan.nextLine();
		String a3 = scan.next();
		System.out.println("a3) 입력받은 값은 " + a3 + "입니다.");
				
		// 문자열 (개행문자 : '\n'까지) // 문장 사용가능
		scan.nextLine();
		String a4 = scan.nextLine();
		System.out.println("a4) 입력받은 값은 " + a4 + "입니다.");
		
	}
}
