package com.my.cjava;

public class Challenge3 {
	public static void main(String[] args) {
	    // 객체 생성
	    Square s = new Square();
	    s.length = 4;
	    s.color = "파랑";

	    // 출력
	    System.out.printf("직사각형의 넓이: %d\n", s.getArea());
	    System.out.printf("직사각형의 색상: %s\n", s.getColor());
	  }
	}

	class Square {
	  /* 필드와 메소드를 구현하시오. */
		int length;
		String color;
			public int getArea() {
				return length * length;
			}
			
			public String getColor(){
				return color;
			}
	}
//230번

