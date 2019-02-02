package com.my.cjava;

import java.util.Scanner;

public class Practise7_For {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, k;
		k= scan.nextInt();
		for(i=0; i<k; ++i) {
			if(i==9)
				break;
			if(i==7)
				continue;
			System.out.println("i: " + i);
		}
		
	}
}
	