package com.my.cjava;

public class Challenge27 {
	public static void main(String[] args) {
	    int[] numbers = { 24, 6, 978, 24, 19, 6, 734};
	    Pair pair = minMax(numbers);
	    System.out.printf("(�ּ�, �ִ�): %s\n", pair.toString());
	  }

	  public static Pair minMax(int[] array) {
	    int min = Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;

	    /* �ش� �޼ҵ带 �����Ͻÿ�. */
	    for(int i = 0; i<array.length; i++)
	    {
			if(array[i] < min)
	    		min = array[i];
			if(array[i] > max)
				max = array[i];
	    }

	    return new Pair(min, max);
	  }
	}

	class Pair {
	  int first;
	  int second;

	  // ����Ʈ ������
	  Pair() {
	    first = second = 0;
	  }

	  // ������A
	  Pair(int x) {
	    first = x;
	    second = 0;
	  }

	  // ������B
	  Pair(int x, int y) {
	    first = x;
	    second = y;
	  }

	  // toString(): ��ü�� ���¸� ���ڿ��� ��ȯ
	  public String toString() {
	    return String.format("(%d, %d)", first, second);
	  }

}//266��
