package com.my.cjava;

import java.util.Scanner;

public class Practise8_While {
	public static void main(String[] args) {
		
		/****************
		 * While문 처리 순서
		 * 1. 조건식 		<-- i<5
		 * 2. 내용 		<-- System.out.println(i++)
		 ****************/
		int i=0;
		while(i<5) {
			System.out.println(i++);
		}
		
		
		
		/****************
		 * Do ~ While문 처리 순서
		 * 1. 내용 		<-- System.out.println(i++)
		 * 2. 조건식 		<-- i<5
		 ****************/		
		i=0;
		do {
			System.out.println(i++);
		} while(i<5);
		
		
		
		// [실습1] Do ~ While를 사용하는 예제
		Scanner scan = new Scanner(System.in);
//		int menu = -1;
//		do {
//			// 메뉴 출력
//			printMenu();
//			
//			// 메뉴 입력
//			menu = scan.nextInt();
//			
//			// 메뉴 처리
//			String data = getProcess(menu);
//		} while(menu != 4);
//	}	
//		static void printMenu() {
//			System.out.println("1. 회원가입\n"
//					+ "2. 로그인\n"
//					+ "3. 로그아웃\n"
//					+ "4. 종료\n=> ");
//			
//		}
//
//		static void getProcess(int menu) {
//			if(menu==1)
//				System.out.println("회원 가입완료.");
//			else if(menu==2)
//				System.out.println("로그인 완료.");
//			else if(menu==3)
//				System.out.println("로그아웃 완료.");
//			else 
//				System.out.println("종료 완료.");
//		}
	
//		do {
//			System.out.println("1. 회원가입\n"
//					+ "2. 로그인\n"
//					+ "3. 로그아웃\n"
//					+ "4. 종료\n=> ");
//			
//			menu = scan.nextInt();
//			switch(menu) {
//				case 1:
//					System.out.println("회원 가입완료.");
//					break;
//				case 2:
//					System.out.println("로그인 완료.");
//					break;
//				case 3:
//					System.out.println("로그아웃 완료.");
//					break;	
//				default:
//					System.out.println("종료 완료.");
//					break;
//				}
//		}while(menu!=4);
	}
}

