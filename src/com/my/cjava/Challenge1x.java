package com.my.cjava;
import java.util.StringTokenizer;

public class Challenge1x {
	public static void main(String[] args) {
		String str = "Java API is so convenient and efficient!";
	    StringTokenizer tokenizer = new StringTokenizer(str, " ");
	    int count = 0;
	    while(true == tokenizer.hasMoreTokens())
	    {
	    	String token = tokenizer.nextToken();
	    	System.out.println("word[" + count + "] => " + token );
	    	count++;
	    }
	    System.out.println("======================");
	    System.out.printf("word count => %d\n", count);
	  }

	
}
