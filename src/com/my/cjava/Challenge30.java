package com.my.cjava;

public class Challenge30 {
	public static void main(String[] args) {
	    // input
	    int n = Integer.parseInt(args[0]);

	    // calculate
	    int hours = n/3600;
	    int minutes = (n%3600)/60;
	    int seconds = n%60;

	    // print
	    System.out.printf(
	      "%d초는 %d시간 %d분 %d초 입니다.\n", 
	      n, hours, minutes, seconds);
	  }

}//170번
