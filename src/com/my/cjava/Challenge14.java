package com.my.cjava;

public class Challenge14 {
	public static void main(String[] args) {
	    // 층수 입력
	    int n = Integer.parseInt(args[0]);

	    // 안내문 출력
	    guide(n);
	  }

	  public static void guide(int floor) {
	    /* 메소드를 완성하시오. */
		  String result = (floor > 10) ? "고층엘레베이터를 이용하세요." : "저층엘레베이터를 이용하세요.";
		  System.out.printf("%s", result);
	  }

	}
//158번

