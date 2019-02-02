package com.my.cjava;

public class Challenge4 {
	public static void main (String[] args) {
	    // 몸무게
	    double weight = 72.4;
	    // 개월 수
	    int n = Integer.parseInt(args[0]);

	    // 반복
	    for (int i = 0; i <= n; ++i, weight += 0.2) {
	        /* 해당 내용을 완성하시오. */
	    	System.out.println(n+"개월 후 몸무게: " + weight+"kg");
	    }
	  }
//195번

}
