package com.my.cjava;

public class Challenge11 {
	public static void main(String[] args) {
	    String str = args[0];
	    String reversedStr = reverse(str);
	    System.out.println(reversedStr);
	  }

	  public static String reverse(String s) {
	    StringBuffer sbuf = new StringBuffer();
	    for (int i = s.length() - 1; i >= 0; i--) {
	      /* �ش� �ڵ带 �ϼ��Ͻÿ� */
	    	 sbuf.append(s.charAt(i));
	    }
	    return sbuf.toString();
	  }
//255��
}
