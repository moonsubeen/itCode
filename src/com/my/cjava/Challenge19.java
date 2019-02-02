package com.my.cjava;

public class Challenge19 {
	public static void main(String[] args) {
	    int lineNum = Integer.parseInt(args[0]);
	    printArrow(lineNum);
	  }

	  private static void printArrow(int n) {
	    /* 해당 메소드를 구현하시오. */
			  int z;
			  for (int i = 0; i < n; i++) 
			  {
			      if(i< n/2)
			    	  z = i;
			      else
			    	  z = (n-i) -1;
			      for (int j = 0; j < z; j++) 
			      {
			        System.out.print(" ");
			      }
			      System.out.println("*");
			  }
	  }

}//258번
