package com.my.cjava;

public class Practise10_Function {
	public static void main(String[] args) {
		/*************************
		 * 리턴타입 함수이름(입력인자) {
		 *    	내용
		 * }
		 * 
		 * 예1)
		 * void func1() {
		 * 		내용
		 * }
		 * 
		 * 예2)
		 * int func2() {
		 * 		내용
		 * 		return 0;
		 * }
		 *************************/	
		
		for(int i=0; i<4; i++)
			func1();
		
		for(int i=0; i<4; i++)
			func2();
		
		int k=4;
		func3(k);
		System.out.println(k);
	}
	
	static void func1() {
		System.out.println("Ahh~~.");
	}
	
	static void func2() {
		for(int i=0; i<2; i++)
			System.out.println("Oh?");
	}
	
	static void func3(int a) {
		System.out.println(a++);
	}
	
//	static int func4(int a) {
//		
//	}
}
