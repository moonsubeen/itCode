package com.my.cjava;

public class Challenge17 {
	  public static void main(String[] args) {
	        /* �Է� �� ��ȯ */
	        int donNum = Integer.parseInt(args[0]); // ������
	        int kalNum = Integer.parseInt(args[1]); // Į����
	        int wangNum = Integer.parseInt(args[2]); // �ո���

	        /* �䰪 ��� */
	        int donSum = 8000*donNum; // ������ �հ�
	        int kalSum = 6000*kalNum; // Į���� �հ�
	        int wangSum = 5000*wangNum; // �ո��� �հ�
	        int total = donSum+kalSum+wangSum; // ��ü �հ�

	        /* ��꼭 ��� */
	        System.out.printf("������ x %d = %d\n", donNum, donSum);
	        System.out.printf("Į���� x %d = %d\n", kalNum, kalSum);
	        System.out.printf("�ո��� x %d = %d\n", wangNum, wangSum);
	        System.out.println("==============");
	        System.out.printf("����: %d\n", total);
	    }
} //7��
