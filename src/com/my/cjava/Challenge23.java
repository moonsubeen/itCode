package com.my.cjava;

public class Challenge23 {
	public static void main(String[] args) {
	    // 객체 생성
	    Book b = new Book();
	  }
}

	class Book {
	  /* 필드와 메소드를 구현하시오. */
		String title;
		String author;
		int price;
		  
		public String toString()
		{
			return String.format("도서명: %s 저자명: %s 가격 : %d", title, author, price);
		}	
}//232번


