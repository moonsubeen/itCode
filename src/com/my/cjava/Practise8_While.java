package com.my.cjava;

import java.util.Scanner;

public class Practise8_While {
	public static void main(String[] args) {
		
		/****************
		 * While�� ó�� ����
		 * 1. ���ǽ� 		<-- i<5
		 * 2. ���� 		<-- System.out.println(i++)
		 ****************/
		int i=0;
		while(i<5) {
			System.out.println(i++);
		}
		
		
		
		/****************
		 * Do ~ While�� ó�� ����
		 * 1. ���� 		<-- System.out.println(i++)
		 * 2. ���ǽ� 		<-- i<5
		 ****************/		
		i=0;
		do {
			System.out.println(i++);
		} while(i<5);
		
		
		
		// [�ǽ�1] Do ~ While�� ����ϴ� ����
		Scanner scan = new Scanner(System.in);
//		int menu = -1;
//		do {
//			// �޴� ���
//			printMenu();
//			
//			// �޴� �Է�
//			menu = scan.nextInt();
//			
//			// �޴� ó��
//			String data = getProcess(menu);
//		} while(menu != 4);
//	}	
//		static void printMenu() {
//			System.out.println("1. ȸ������\n"
//					+ "2. �α���\n"
//					+ "3. �α׾ƿ�\n"
//					+ "4. ����\n=> ");
//			
//		}
//
//		static void getProcess(int menu) {
//			if(menu==1)
//				System.out.println("ȸ�� ���ԿϷ�.");
//			else if(menu==2)
//				System.out.println("�α��� �Ϸ�.");
//			else if(menu==3)
//				System.out.println("�α׾ƿ� �Ϸ�.");
//			else 
//				System.out.println("���� �Ϸ�.");
//		}
	
//		do {
//			System.out.println("1. ȸ������\n"
//					+ "2. �α���\n"
//					+ "3. �α׾ƿ�\n"
//					+ "4. ����\n=> ");
//			
//			menu = scan.nextInt();
//			switch(menu) {
//				case 1:
//					System.out.println("ȸ�� ���ԿϷ�.");
//					break;
//				case 2:
//					System.out.println("�α��� �Ϸ�.");
//					break;
//				case 3:
//					System.out.println("�α׾ƿ� �Ϸ�.");
//					break;	
//				default:
//					System.out.println("���� �Ϸ�.");
//					break;
//				}
//		}while(menu!=4);
	}
}

