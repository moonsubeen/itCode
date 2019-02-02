package com.my.cjava;

public class Challenge31 {
	public static void main(String[] args) {
	    int year = Integer.parseInt(args[0]);
	    printAnimal(year);
	  }

	  private static void printAnimal(int birthYear) {
	    String animal = "";
	    /* switch문을 사용하여 코드를 완성하시오. */
	    switch(birthYear % 12) 
	    {
	    case 0:
	    	animal = "원숭이";
	    	break;
	    case 1:
	    	animal = "닭";
	    	break;
	    case 2:
	    	animal = "개";
	    	break;
	    case 3:
	    	animal = "돼지";
	    	break;
	    case 4:
	    	animal = "쥐";
	    	break;
	    case 5:
	    	animal = "소";
	    	break;
	    case 6:
	    	animal = "호랑이";
	    	break;
	    case 7:
	    	animal = "토끼";
	    	break;
	    case 8:
	    	animal = "용";
	    	break;
	    case 9:
	    	animal = "뱀";
	    	break;
	    case 10:
	    	animal = "말";
	    	break;
	    case 11:
	    	animal = "양";
	    	break;
	    default:
	    	break;
	    }
	    System.out.println(animal);
	  }

}//159번
