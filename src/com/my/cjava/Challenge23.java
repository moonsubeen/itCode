package com.my.cjava;

public class Challenge23 {
	public static void main(String[] args) {
	    // ��ü ����
	    Book b = new Book();
	  }
}

	class Book {
	  /* �ʵ�� �޼ҵ带 �����Ͻÿ�. */
		String title;
		String author;
		int price;
		  
		public String toString()
		{
			return String.format("������: %s ���ڸ�: %s ���� : %d", title, author, price);
		}	
}//232��


