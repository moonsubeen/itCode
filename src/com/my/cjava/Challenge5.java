package com.my.cjava;

public class Challenge5 {
	public static void main(String[] args) {
	    // input
	    String text = "����, ���� ���θ�! ������ �ߴ�. (������)& ����� �����ߴ�.";

	    // replace
	    String replaced = text.replaceAll("[,!&()]","");

	    // print
	    System.out.println(replaced);
	  }
//188��
//	public static void main(String[] args) {
//	    String phoneNumber = "����ó: 82+) 10-1234-5678";
//	    System.out.println(phoneNumber.replaceAll("[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]", "xxxx-xxxx"));
//	  }
}
