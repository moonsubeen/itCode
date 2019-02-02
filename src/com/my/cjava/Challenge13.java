package com.my.cjava;

public class Challenge13 {
	 public static void main(String[] args) {
		    // 객체 배열 생성
		    Account[] accounts = new Account[5];
		    int count = 0;

		    // 계좌 생성
		    Account a = new Account();
		    a.deposit(50000);
		    accounts[count++] = a;

		    Account b = new Account();
		    b.deposit(40000);
		    accounts[count++] = b;

		    // 출력
		    for (int i = 0; i < count; i ++) {
		      System.out.printf("고객 #%d 계좌 잔고: %d원\n", i, accounts[i].balance);
		    }
		  }
		
}
		class Account {
		  /* 필드와 메소드를 구현하시오. */
			// 필드
			  int balance;
			  
			  // 생성자
			  public Account() {
			    balance = 0;
			    System.out.println("새로운 계좌가 생성되었습니다.");
			  }
			  
			  // 예금
			  public void deposit(int amount) {
			    balance += amount;
			    System.out.printf("%d원 예금\n", amount);
			  }
			  
			  // 인출
			  public int withdraw(int amount) {
			    balance -= amount;
			    System.out.printf("%d원 출금\n", amount);
			    return amount;
			  }
		}
//241번

