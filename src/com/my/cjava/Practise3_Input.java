package com.my.cjava;

import java.util.Scanner;

public class Practise3_Input {

	// �Է�
	public static void main(String[] args) {
		
		// �Է�------------------------------------------------
		// �� scan.nextLine()�� ���� ���� ? 
		// ���� ��ɿ��� �ƴ� ����('\n')�� ���ۿ� ���� �ֱ� ������, �� ���� ���� ���̴�.
		
		Scanner scan = new Scanner(System.in);
		
		// ����
		int a1 = scan.nextInt();
		System.out.println("a1) �Է¹��� ���� " + a1 + "�Դϴ�.");
		
		// �Ҽ�
		double a2 = scan.nextDouble();
		System.out.println("a2) �Է¹��� ���� " + a2 + "�Դϴ�.");
		
		// ���ڿ� (���鹮�� : ' '����) // �ܾ ��밡��
		scan.nextLine();
		String a3 = scan.next();
		System.out.println("a3) �Է¹��� ���� " + a3 + "�Դϴ�.");
				
		// ���ڿ� (���๮�� : '\n'����) // ���� ��밡��
		scan.nextLine();
		String a4 = scan.nextLine();
		System.out.println("a4) �Է¹��� ���� " + a4 + "�Դϴ�.");
		
	}
}
