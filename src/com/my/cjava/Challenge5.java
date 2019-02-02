package com.my.cjava;

public class Challenge5 {
	public static void main(String[] args) {
	    // input
	    String text = "나는, 토익 공부를! 열심히 했다. (하지만)& 결과는 냉정했다.";

	    // replace
	    String replaced = text.replaceAll("[,!&()]","");

	    // print
	    System.out.println(replaced);
	  }
//188번
//	public static void main(String[] args) {
//	    String phoneNumber = "연락처: 82+) 10-1234-5678";
//	    System.out.println(phoneNumber.replaceAll("[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]", "xxxx-xxxx"));
//	  }
}
