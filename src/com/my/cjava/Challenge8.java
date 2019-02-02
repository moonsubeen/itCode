package com.my.cjava;

public class Challenge8 {
	public static void main(String[] args) {
	    /* 메뉴 가격을 대입 */
	    int duckboki = 2500;
	    int twikim = 700;
	    int soondae = 3000;

	    /* 주문 개수에 따른 값을 대입 */
	    int duckbokiCount = 2;
	    int twikimCount = 8;
	    int soondaeCount = 1;

	    /* 최종 금액을 계산 */
	    int totalPrice = duckboki*duckbokiCount + twikim*twikimCount + soondae*soondaeCount;

	    // 결과 출력
	    System.out.println(totalPrice);

	}
}//62번