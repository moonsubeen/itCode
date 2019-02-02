package com.my.cjava;

public class Challenge22 {
	public static void main(String[] args) {
	    // 객체 생성
	    Cylinder c = new Cylinder();
	    
	    // 속성 값 입력
	    c.radius = 4;
	    c.height = 5;
	    
	    // 출력
	    System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
	    System.out.printf("원기둥의 넓이: %.2f\n", c.getArea());
	  }
	}

	class Cylinder {
	  /* 필드와 메소드를 구현하시오. */
	  int radius;
	  int height;
	  
	  public double getVolume() {
	    return radius * radius * Math.PI * height;
	  }
	  
	  public double getArea() {
	    double circleArea = Math.PI * radius * radius;
	    double rectangleArea = height * 2 * Math.PI * radius;
	    return 2 * circleArea + rectangleArea;
	  }
}//231번
