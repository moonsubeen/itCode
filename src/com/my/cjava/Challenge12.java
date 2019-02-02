package com.my.cjava;

public class Challenge12 {
	public static void main(String[] args) {
	    // print
	    System.out.println("(5kg, 3kg, 2kg)");
	    printCombinations(81);
	  }

	  public static void printCombinations(int target) {
	    /* 해당 메소드를 완성하시오. */
		  int sum = 0;
		    for (int i = 1; sum <= target; i++)
		    {
		      for (int j = 1; sum <= target; j++)
		      {
		        for (int k = 1; sum <= target; k++)
		        {
		          sum = 5 * i + 3 * j + 2 * k;
		          if (sum == target) {
		            System.out.printf("(%d, %d, %d)\n", i, j, k);
		          }  
		        }
		        sum = 5 * i + 3 * j;
		      }
		      sum = 5 * i;
		    }
	  }
//245번
}
