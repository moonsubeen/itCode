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
	    /* 다음 메소드를 완성하시오. */
		System.out.printf("%d 이체 요청 => ", amount);
		if(limit > amount + sum)
		{
			System.out.println("성공 : 남은한도 " + (limit-(amount + sum)) + "원" );
			return true;
		}
		else
		{
			System.out.println("실패: 이체한도 초과");
			return false;
		}
	  }

} //172번
