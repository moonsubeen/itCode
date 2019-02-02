package com.my.cjava;

public class Challenge27 {
	public static void main(String[] args) {
	    int[] numbers = { 24, 6, 978, 24, 19, 6, 734};
	    Pair pair = minMax(numbers);
	    System.out.printf("(최소, 최대): %s\n", pair.toString());
	  }

	  public static Pair minMax(int[] array) {
	    int min = Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;

	    /* 해당 메소드를 구현하시오. */
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

	  // 디폴트 생성자
	  Pair() {
	    first = second = 0;
	  }

	  // 생성자A
	  Pair(int x) {
	    first = x;
	    second = 0;
	  }

	  // 생성자B
	  Pair(int x, int y) {
	    first = x;
	    second = y;
	  }

	  // toString(): 객체의 상태를 문자열로 반환
	  public String toString() {
	    return String.format("(%d, %d)", first, second);
	  }

}//266번
