package com.my.cjava;

public class Challenge26 {
	 public static void main(String[] args) {
		    // input
		    int n = Integer.parseInt(args[0]);
		    System.out.printf("n = %d\n", n);
		    // variables
		    int fn = 0;
		    int prev1 = 0;
		    int prev2 = 1;
		    int sum = 0;

		    System.out.print("�Ǻ���ġ ��: ");

		    for (int i = 0; i < n; i++) {
		      /* �ش� �κ��� �ϼ��Ͻÿ�. */
		    	System.out.printf("%d ", fn);
		    	fn = prev1 + prev2;
		    	prev2 = prev1;
		    	prev1 = fn;
		    	sum = sum + fn;
		    }
		    // print
		    System.out.println();
		    System.out.printf("�հ�: %d\n", sum);
		  }

} //183��
