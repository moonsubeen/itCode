package com.my.cjava;

public class Challenge10 {
	public static String wearResult(int hp, int mp) {
	    String result = "�������� ������ �� �����ϴ�."; 
	    if (hp>2000 && mp >2000)
	      result = "�������� ���� �Ǿ����ϴ�.";

	    return result;
	  }
	  public static void main(String[] args) {
	    int hp = Integer.parseInt(args[0]);
	    int mp = Integer.parseInt(args[1]);
	    System.out.println(wearResult(hp, mp));
	  }

}//88��
