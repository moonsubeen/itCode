package com.my.cjava;

import java.util.Scanner;

public class Practise6_If {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		
		/***********************
		 if(���ǽ�) { 
		   	����  
		 }
		 
		 ����Ʈ1. ���ǽ��� ��(=0�� �ƴ�)�� ���� ����ȴ�.
		 ����Ʈ2. ������ ����� true�̰ų� false�̴�.
		 ************************/
		
//		int a1;
//		a1 = scan.nextInt();
//		if(a1%2 == 1) {
//			System.out.println("a1) Ȧ���Դϴ�.");
//		}
//		System.out.println("a1) �۾��� ����Ǿ����ϴ�.");
		
		
		/***********************
		 if(���ǽ�) { 
		   	����  
		 } else {
		       ����
		 }
		 ************************/
		
		// To do.
		
		/***********************
		 if(���ǽ�) { 
		   	����  
		 } else if(�ٸ� ���ǽ�) {
		       ����
		 } else {
		       ����
		 }
		 ************************/
		
		// To do.		
		
		/***********************
		 if(���ǽ�)
		   	����  
		 else if(�ٸ� ���ǽ�
		       ����
		 else
		       ����		
		 ************************/
		
		// To do.
		int c;
		c = scan.nextInt();
		if(c==0)
			System.out.println("it's 0.");
		else if(c==1)
			System.out.println("it's 1.");
		else if(c%2==1)
			System.out.println("it's odd.");
		else
			System.out.println("it's even.");
		
	}
}
