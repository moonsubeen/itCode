package com.my.cjava;

public class Challenge25 {
	public static void main(String[] args) {
	    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	    print(numbers);
	  }

	  private static void print(int[] arr) {
	    System.out.println("출력결과 >");
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	      /* 해당 부분을 완성 하시오. */
	    	sum = sum + arr[i];
	    	System.out.println("배열[" + i + "] = " + sum);
	    }
	    System.out.println("배열 합 : " + sum);
	  }

}//198번
