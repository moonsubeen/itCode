package com.my.cjava;

public class Practise10_Function {
	public static void main(String[] args) {
		/*************************
		 * ����Ÿ�� �Լ��̸�(�Է�����) {
		 *    	����
		 * }
		 * 
		 * ��1)
		 * void func1() {
		 * 		����
		 * }
		 * 
		 * ��2)
		 * int func2() {
		 * 		����
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
