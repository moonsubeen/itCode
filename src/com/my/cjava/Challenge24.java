package com.my.cjava;

public class Challenge24 {
	public static void main (String[] args) {
	    for (String s : args) {
	      printResult(s);
	    }
	    System.out.println("���α׷� ����.");
	  }
	  
	  public static void printResult(String str) {
		  /* �ش� �޼ҵ带 �����Ͻÿ�. */
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
	    	  System.out.printf("�Է¹���: %s\n\t=> ����\n", str);
	    	  break;	      
	      case "quit":
	      case "QUIT":
	    	  return;  
	      default:
	    	  System.out.printf("�Է¹���: %s\n\t=> ����\n", str);
	    	  break;
	    }
	  }
}//199��
