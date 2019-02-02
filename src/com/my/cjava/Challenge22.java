package com.my.cjava;

public class Challenge22 {
	public static void main(String[] args) {
	    // ��ü ����
	    Cylinder c = new Cylinder();
	    
	    // �Ӽ� �� �Է�
	    c.radius = 4;
	    c.height = 5;
	    
	    // ���
	    System.out.printf("������� ����: %.2f\n", c.getVolume());
	    System.out.printf("������� ����: %.2f\n", c.getArea());
	  }
	}

	class Cylinder {
	  /* �ʵ�� �޼ҵ带 �����Ͻÿ�. */
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
}//231��
