package com.my.cjava;

public class Challenge4 {
	public static void main (String[] args) {
	    // ������
	    double weight = 72.4;
	    // ���� ��
	    int n = Integer.parseInt(args[0]);

	    // �ݺ�
	    for (int i = 0; i <= n; ++i, weight += 0.2) {
	        /* �ش� ������ �ϼ��Ͻÿ�. */
	    	System.out.println(n+"���� �� ������: " + weight+"kg");
	    }
	  }
//195��

}
