package com.my.cjava;

public class Challenge13 {
	 public static void main(String[] args) {
		    // ��ü �迭 ����
		    Account[] accounts = new Account[5];
		    int count = 0;

		    // ���� ����
		    Account a = new Account();
		    a.deposit(50000);
		    accounts[count++] = a;

		    Account b = new Account();
		    b.deposit(40000);
		    accounts[count++] = b;

		    // ���
		    for (int i = 0; i < count; i ++) {
		      System.out.printf("�� #%d ���� �ܰ�: %d��\n", i, accounts[i].balance);
		    }
		  }
		
}
		class Account {
		  /* �ʵ�� �޼ҵ带 �����Ͻÿ�. */
			// �ʵ�
			  int balance;
			  
			  // ������
			  public Account() {
			    balance = 0;
			    System.out.println("���ο� ���°� �����Ǿ����ϴ�.");
			  }
			  
			  // ����
			  public void deposit(int amount) {
			    balance += amount;
			    System.out.printf("%d�� ����\n", amount);
			  }
			  
			  // ����
			  public int withdraw(int amount) {
			    balance -= amount;
			    System.out.printf("%d�� ���\n", amount);
			    return amount;
			  }
		}
//241��

