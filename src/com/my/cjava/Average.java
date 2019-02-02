package com.my.cjava;
import java.util.Arrays;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		 // input
	    int n = Integer.parseInt(args[0]);
	    int[] numbers = getInputNumbers(Arrays.copyOfRange(args, 1, args.length));
	    Scanner scan = new Scanner(System.in);
	    // average
	    double average = getAverage(numbers);
	    
	    // print
	    System.out.printf("Æò±Õ: %.2f\n", average);
	  }
	  
	  private static int[] getInputNumbers(String[] args) {
	    int[] arr = new int[args.length];
	    for (int i = 0; i < args.length; i++) {
	      arr[i] = Integer.parseInt(args[i]);
	    }
	    return arr;
	  }
	  
	  private static double getAverage(int[] arr) {
		/* Æò±ÕÀ» ±¸ÇÏ½Ã¿À. */
		double sum = 0;
		for (int i =0; i<7; i++) {
		     sum = sum + arr[i]; 
		   }
		return sum/arr.length;
	  
	  }
}
