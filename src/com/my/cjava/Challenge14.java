package com.my.cjava;

public class Challenge14 {
	public static void main(String[] args) {
	    // ���� �Է�
	    int n = Integer.parseInt(args[0]);

	    // �ȳ��� ���
	    guide(n);
	  }

	  public static void guide(int floor) {
	    /* �޼ҵ带 �ϼ��Ͻÿ�. */
		  String result = (floor > 10) ? "�������������͸� �̿��ϼ���." : "�������������͸� �̿��ϼ���.";
		  System.out.printf("%s", result);
	  }

	}
//158��

