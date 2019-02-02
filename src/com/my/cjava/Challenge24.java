package com.my.cjava;

public class Challenge24 {
	public static void main (String[] args) {
	    for (String s : args) {
	      printResult(s);
	    }
	    System.out.println("프로그램 종료.");
	  }
	  
	  public static void printResult(String str) {
		  /* 해당 메소드를 구현하시오. */
		  switch (str) {
		  case "a":
	      case "e":
	      case "i":
	      case "o":
	      case "u":
	      case "A":
	      case "E":
	      case "I":
	      case "O":
	      case "U":
	    	  System.out.printf("입력문자: %s\n\t=> 모음\n", str);
	    	  break;	      
	      case "quit":
	      case "QUIT":
	    	  return;  
	      default:
	    	  System.out.printf("입력문자: %s\n\t=> 자음\n", str);
	    	  break;
	    }
	  }
}//199번
