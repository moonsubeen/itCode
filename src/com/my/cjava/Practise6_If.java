package com.my.cjava;

import java.util.Scanner;

public class Practise6_If {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		
		/***********************
		 if(조건식) { 
		   	내용  
		 }
		 
		 포인트1. 조건식이 참(=0이 아님)일 때만 실행된다.
		 포인트2. 조건의 결과는 true이거나 false이다.
		 ************************/
		
//		int a1;
//		a1 = scan.nextInt();
//		if(a1%2 == 1) {
//			System.out.println("a1) 홀수입니다.");
//		}
//		System.out.println("a1) 작업이 종료되었습니다.");
		
		
		/***********************
		 if(조건식) { 
		   	내용  
		 } else {
		       내용
		 }
		 ************************/
		
		// To do.
		
		/***********************
		 if(조건식) { 
		   	내용  
		 } else if(다른 조건식) {
		       내용
		 } else {
		       내용
		 }
		 ************************/
		
		// To do.		
		
		/***********************
		 if(조건식)
		   	내용  
		 else if(다른 조건식
		       내용
		 else
		       내용		
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
