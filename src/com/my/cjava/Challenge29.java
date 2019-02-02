package com.my.cjava;

public class Challenge29 {
	public static void main(String[] args) {
	    int limit = Integer.parseInt(args[0]);
	    int sum = 0;

	    for (int i = 1; i < args.length; i++) {
	      int money = Integer.parseInt(args[i]);
	      boolean isSuccess = transfer(money, limit, sum);
	      if (isSuccess) {
	        sum += money;
	      } else {
	        break;
	      }
	    }
	  }

	  public static boolean transfer(int amount, int limit, int sum) {
	    /* ���� �޼ҵ带 �ϼ��Ͻÿ�. */
		System.out.printf("%d ��ü ��û => ", amount);
		if(limit > amount + sum)
		{
			System.out.println("���� : �����ѵ� " + (limit-(amount + sum)) + "��" );
			return true;
		}
		else
		{
			System.out.println("����: ��ü�ѵ� �ʰ�");
			return false;
		}
	  }

} //172��
