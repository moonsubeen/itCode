package com.my.cjava;

public class Practise1_Operator_Challenge {
	
	// 연산자 실습
	public static void main(String[] args) {
		
//		// [실습1] 배열 값의 내용을 '*'로 변경하기
//		int a2[] = {1,2,3};
//		a2[1] = 3;
//		System.out.println("a2) " + a2[0] + ", " + a2[1] + ", " + a2[2]);
//		
//		// [실습2] 함수 연산을 곱(*)으로 변경하기
//		int a3 = func(1,2);
//		System.out.println("a3) " + a3);
		
		// [실습3] 아래 값 예상하기
//		int a=10, b=5;
//		System.out.println(a++ + --b + --a - b++);
		
		// [실습4] 0부터 누적(sum)값이 100이 넘어서는 값을 출력하도록 변경하기
		// ※ 조건 하나 추가해서 (i.e isOver == true)
//		int a = 0;
//		int sum = 0;
//		boolean isOver = false;
//		while(a<100 && isOver == false) {
//			a++;
//			sum = sum + a;
//			if(sum>100)
//			{System.out.println(a);
//			 isOver = true;
//			}
//		}       
//		
		// [실습5] 0~100 사이의 솟수 찾아내기
//		int ai = 2;
//		while(ai<100)
//		{
//			int bi = 2;
//			 while(bi < ai)
//			 {
//				 if(ai % bi == 0)
//				 {
//					 break;
//				 }
//				 bi++;
//			 }
//			 if(ai==bi)
//				{
//				 System.out.println(ai);
//				}
//			ai++;
//		}
		
//		// [실습6] 2진수 출력을 8진수 출력으로 변경하기
//		int a6 = 1000;
//		System.out.println(Integer.toBinaryString(a6));
//		while(a6>0) {
//			System.out.print(a6 & 0b111);
//			a6 = a6 >> 3;
//		}
//		System.out.println();
		
//		// [실습7] i가 182일 때 작업을 종료하도록 변경하기
//		int i=0;
//		while(i<1000) {
//			i++;
//			if(i == 182)
//				break;
//		}
//		System.out.println("i:" + i);
//		
//		// [실습8] 100보다 큰수인지 작은지를 출력하도록 변경하기
//		int a8 = 100;
//		String str = (a8 > 100) ? "큰수" : ((a8 == 100) ? "100이다" : "작은수");
//		System.out.println("a8은 " + str + "입니다.");
		
		// [실습9] 아래의 대입연산을 축약된 스타일로 변경하기
		int a9 = 50;
		a9 += 10;
		a9 -= 10;		
	}
//	
//	public static int func(int a, int b) {
//		int c = a + b;
//		return c;
//	}
}
