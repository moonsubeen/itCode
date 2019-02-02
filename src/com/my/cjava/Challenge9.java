package com.my.cjava;

public class Challenge9 {
	public static void order(int age) {
	    /* 해당 메소드를 구현 하시오 */
		if (age >= 18) {
		      System.out.println("주문이 완료 되었습니다.");
		    }
	  }

	  public static void main(String[] args) {
	    int age = Integer.parseInt(args[0]);
	    order(age);
	  }
//87번
}
