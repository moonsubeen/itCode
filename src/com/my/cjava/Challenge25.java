package com.my.cjava;

public class Challenge25 {
	public static void main(String[] args) {
	    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	    print(numbers);
	  }

	  private static void print(int[] arr) {
	    System.out.println("��°�� >");
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	      /* �ش� �κ��� �ϼ� �Ͻÿ�. */
	    	sum = sum + arr[i];
	    	System.out.println("�迭[" + i + "] = " + sum);
	    }
	    System.out.println("�迭 �� : " + sum);
	  }

}//198��
