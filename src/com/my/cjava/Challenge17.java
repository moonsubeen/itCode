package com.my.cjava;

public class Challenge17 {
	  public static void main(String[] args) {
	        /* ÀÔ·Â °ª º¯È¯ */
	        int donNum = Integer.parseInt(args[0]); // µ·°¡½º
	        int kalNum = Integer.parseInt(args[1]); // Ä®±¹¼ö
	        int wangNum = Integer.parseInt(args[2]); // ¿Õ¸¸µÎ

	        /* ¹ä°ª °è»ê */
	        int donSum = 8000*donNum; // µ·°¡½º ÇÕ°è
	        int kalSum = 6000*kalNum; // Ä®±¹½º ÇÕ°è
	        int wangSum = 5000*wangNum; // ¿Õ¸¸µÎ ÇÕ°è
	        int total = donSum+kalSum+wangSum; // ÀüÃ¼ ÇÕ°è

	        /* °è»ê¼­ Ãâ·Â */
	        System.out.printf("µ·°¡½º x %d = %d\n", donNum, donSum);
	        System.out.printf("Ä®±¹¼ö x %d = %d\n", kalNum, kalSum);
	        System.out.printf("¿Õ¸¸µÎ x %d = %d\n", wangNum, wangSum);
	        System.out.println("==============");
	        System.out.printf("ÃÑÇÕ: %d\n", total);
	    }
} //7¹ø
