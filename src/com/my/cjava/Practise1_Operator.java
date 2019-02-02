package com.my.cjava;

public class Practise1_Operator {
	
	// ������	
	public static void main(String[] args) {
		
		// �켱���� 1���� ���� (--> ������ ����)
		//------------------------------------------------------------
		// 1. �������
		A a1 = new A();
		a1.b = 3;
		System.out.println("a1) " + a1.b);
		
		// 2. �迭÷�� [�ǽ�1]
		int a2[] = {1,2,3};
		a2[1] = 3;
		System.out.println("a2) " + a2[0] + ", " + a2[1] + ", " + a2[2]);
		
		// 3. �Լ�ȣ�� [�ǽ�2]
		int a3 = func(1,2);
		System.out.println("a3) " + a3);
				
		// 4. ��������/����
		int a4 = 0;
		a4++;
		a4--;		
		System.out.println("a4) " + a4);
		
		// �켱���� 2���� ���� (<-- ������ ����)
		//------------------------------------------------------------
		// 1. ��������/���� [�ǽ�3]
		int b1 = 0;
		++b1;
		--b1;
		System.out.println("b1) " + b1);
		
		// ��Ʈ����
		//------------------------------------------------------------
		int c1=3;
		System.out.println("c1) " + Integer.toBinaryString(c1));
		System.out.println("c1) " + Integer.toBinaryString(~c1));
		
		int c2=2;
		System.out.println("c2) " + Integer.toBinaryString(c1 & c2));
		System.out.println("c2) " + Integer.toBinaryString(c1 ^ c2));
		System.out.println("c2) " + Integer.toBinaryString(c1 | c2));
		
		// ������
		//------------------------------------------------------------
		// 1. ������
		boolean d1 = true;
		System.out.println("d1) " + d1);
		System.out.println("d1) " + !d1);
		
		// 2. ����, ���� [�ǽ�4]
		boolean d2 = false;
		System.out.println("d2) " + (d1 && d2));
		System.out.println("d2) " + (d1 || d2));
		System.out.println("d2) " + (d1 & d2));
		System.out.println("d2) " + (d1 ^ d2));
		
		// ĳ��Ʈ(����ȯ)------------------------------------------------
		double e1 = 3.14;
		System.out.println("e1) " + e1);
		
		int e2 = (int) e1;		
		System.out.println("e2) " + e2);
		
		// ���׿���-----------------------------------------------------
		int f1 = 6;
		int f2 = 2;
		
		// [�ǽ�5]
		System.out.println("f1) " + (f1+f2));
		System.out.println("f1) " + (f1-f2));
		System.out.println("f1) " + (f1*f2));
		System.out.println("f1) " + (f1%f2));
		
		// ����Ʈ����---------------------------------------------------
		int g1 = 2;
		System.out.println("g1) " + g1);
		System.out.println("g1) " + Integer.toBinaryString(g1));
		
		g1 = g1 << 1; // 2�� n�� (=���� n+1)
		System.out.println("g1) " + g1);
		System.out.println("g1) " + Integer.toBinaryString(g1));
		
		// [�ǽ�6]
		g1 = g1 >> 1; // 2�� n�� (=���� n-1)
		System.out.println("g1) " + g1);
		System.out.println("g1) " + Integer.toBinaryString(g1));
		
		// �񱳿���----------------------------------------------------
		int h1 = 2;
		int h2 = 3;
		System.out.println("h1) " + (h1 > h2));
		System.out.println("h1) " + (h1 < h2));
		
		System.out.println("h1) " + (h1 >= h2));
		System.out.println("h1) " + (h1 <= h2));
		
		// [�ǽ�7]
		System.out.println("h1) " + (h1 == h2));
		System.out.println("h1) " + (h1 != h2));
		
		// ���׿���----------------------------------------------------
		// [�ǽ�8]
		int i1 = 100;
		int i2 = 200;
		int i3 = (5>8) ? i1 : i2;
		System.out.println("i1) " + i3);
		
		// ���Կ���----------------------------------------------------
		// [�ǽ�9]
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
