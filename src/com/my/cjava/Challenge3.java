package com.my.cjava;

public class Challenge3 {
	public static void main(String[] args) {
	    // ��ü ����
	    Square s = new Square();
	    s.length = 4;
	    s.color = "�Ķ�";

	    // ���
	    System.out.printf("���簢���� ����: %d\n", s.getArea());
	    System.out.printf("���簢���� ����: %s\n", s.getColor());
	  }
	}

	class Square {
	  /* �ʵ�� �޼ҵ带 �����Ͻÿ�. */
		int length;
		String color;
			public int getArea() {
				return length * length;
			}
			
			public String getColor(){
				return color;
			}
	}
//230��

