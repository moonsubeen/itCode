package com.my.cjava;

public class Practise1_Operator {
	
	// 연산자	
	public static void main(String[] args) {
		
		// 우선순위 1순위 연산 (--> 방향의 연산)
		//------------------------------------------------------------
		// 1. 멤버선택
		A a1 = new A();
		a1.b = 3;
		System.out.println("a1) " + a1.b);
		
		// 2. 배열첨자 [실습1]
		int a2[] = {1,2,3};
		a2[1] = 3;
		System.out.println("a2) " + a2[0] + ", " + a2[1] + ", " + a2[2]);
		
		// 3. 함수호출 [실습2]
		int a3 = func(1,2);
		System.out.println("a3) " + a3);
				
		// 4. 후위증가/감소
		int a4 = 0;
		a4++;
		a4--;		
		System.out.println("a4) " + a4);
		
		// 우선순의 2순위 연산 (<-- 방향의 연산)
		//------------------------------------------------------------
		// 1. 전위증가/감소 [실습3]
		int b1 = 0;
		++b1;
		--b1;
		System.out.println("b1) " + b1);
		
		// 비트연산
		//------------------------------------------------------------
		int c1=3;
		System.out.println("c1) " + Integer.toBinaryString(c1));
		System.out.println("c1) " + Integer.toBinaryString(~c1));
		
		int c2=2;
		System.out.println("c2) " + Integer.toBinaryString(c1 & c2));
		System.out.println("c2) " + Integer.toBinaryString(c1 ^ c2));
		System.out.println("c2) " + Integer.toBinaryString(c1 | c2));
		
		// 논리연산
		//------------------------------------------------------------
		// 1. 논리부정
		boolean d1 = true;
		System.out.println("d1) " + d1);
		System.out.println("d1) " + !d1);
		
		// 2. 논리곱, 논리합 [실습4]
		boolean d2 = false;
		System.out.println("d2) " + (d1 && d2));
		System.out.println("d2) " + (d1 || d2));
		System.out.println("d2) " + (d1 & d2));
		System.out.println("d2) " + (d1 ^ d2));
		
		// 캐스트(형변환)------------------------------------------------
		double e1 = 3.14;
		System.out.println("e1) " + e1);
		
		int e2 = (int) e1;		
		System.out.println("e2) " + e2);
		
		// 단항연산-----------------------------------------------------
		int f1 = 6;
		int f2 = 2;
		
		// [실습5]
		System.out.println("f1) " + (f1+f2));
		System.out.println("f1) " + (f1-f2));
		System.out.println("f1) " + (f1*f2));
		System.out.println("f1) " + (f1%f2));
		
		// 시프트연산---------------------------------------------------
		int g1 = 2;
		System.out.println("g1) " + g1);
		System.out.println("g1) " + Integer.toBinaryString(g1));
		
		g1 = g1 << 1; // 2의 n승 (=기존 n+1)
		System.out.println("g1) " + g1);
		System.out.println("g1) " + Integer.toBinaryString(g1));
		
		// [실습6]
		g1 = g1 >> 1; // 2의 n승 (=기존 n-1)
		System.out.println("g1) " + g1);
		System.out.println("g1) " + Integer.toBinaryString(g1));
		
		// 비교연산----------------------------------------------------
		int h1 = 2;
		int h2 = 3;
		System.out.println("h1) " + (h1 > h2));
		System.out.println("h1) " + (h1 < h2));
		
		System.out.println("h1) " + (h1 >= h2));
		System.out.println("h1) " + (h1 <= h2));
		
		// [실습7]
		System.out.println("h1) " + (h1 == h2));
		System.out.println("h1) " + (h1 != h2));
		
		// 삼항연산----------------------------------------------------
		// [실습8]
		int i1 = 100;
		int i2 = 200;
		int i3 = (5>8) ? i1 : i2;
		System.out.println("i1) " + i3);
		
		// 대입연산----------------------------------------------------
		// [실습9]
		int j1 = 2;
		j1 += 3;
		j1 -= 3;
		j1 *= 3;
		j1 /= 3;
		j1 %= 3;
		System.out.println("j1) " + j1);
	}
	
	public static class A {
		int b;		
	}
	
	public static int func(int a, int b) {
		int c = a + b;
		return c;
	}
}
