package com.my.cjava;

public class Challenge20 {
	public static void main(String[] args) {
	    // input
	    String str = args[0];
	    int n = -1;

	    // convert
	    switch (str) {
	    case "zero":
	      n = 0;
	      break;
	    case "one":
	      n = 1;
	      break;
	    case "two":
	      n = 2;
	      break;
	    case "three":
	      n = 3;
	      break;
	    case "four":
	      n = 4;
	      break;
	    case "five":
	      n = 5;
	      break;
	    case "six":
	      n = 6;
	      break;
	    case "seven":
	      n = 7;
	      break;
	    case "eight":
	      n = 8;
	      break;
	    case "nine":
	      n = 9;
	      break;
	    default:
	      break;
	    }

	    // print
	    System.out.printf("%s => %d\n", str, n);
	  }

}//259¹ø
