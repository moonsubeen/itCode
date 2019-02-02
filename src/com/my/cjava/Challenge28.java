package com.my.cjava;

public class Challenge28 {
	 public static void main(String[] args) {
		    // input
		    int year = Integer.parseInt(args[0]);
		    boolean isLeapYear = false;

		    // test
		    if (year % 4 == 0) {
		      isLeapYear = true; 
		      if (year % 100 == 0) {
		        isLeapYear = false; 
		        if (year % 1000 == 0) {
		          isLeapYear = true; 
		        }
		      }
		    }

		    // print
		    System.out.printf("%d년은 윤년입니까? %s\n", year, isLeapYear);
		  }
}//184번
