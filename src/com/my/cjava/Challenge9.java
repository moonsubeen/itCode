package com.my.cjava;

public class Challenge9 {
	public static void order(int age) {
	    /* �ش� �޼ҵ带 ���� �Ͻÿ� */
		if (age >= 18) {
		      System.out.println("�ֹ��� �Ϸ� �Ǿ����ϴ�.");
		    }
	  }

	  public static void main(String[] args) {
	    int age = Integer.parseInt(args[0]);
	    order(age);
	  }
//87��
}
