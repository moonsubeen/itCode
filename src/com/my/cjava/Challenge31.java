package com.my.cjava;

public class Challenge31 {
	public static void main(String[] args) {
	    int year = Integer.parseInt(args[0]);
	    printAnimal(year);
	  }

	  private static void printAnimal(int birthYear) {
	    String animal = "";
	    /* switch���� ����Ͽ� �ڵ带 �ϼ��Ͻÿ�. */
	    switch(birthYear % 12) 
	    {
	    case 0:
	    	animal = "������";
	    	break;
	    case 1:
	    	animal = "��";
	    	break;
	    case 2:
	    	animal = "��";
	    	break;
	    case 3:
	    	animal = "����";
	    	break;
	    case 4:
	    	animal = "��";
	    	break;
	    case 5:
	    	animal = "��";
	    	break;
	    case 6:
	    	animal = "ȣ����";
	    	break;
	    case 7:
	    	animal = "�䳢";
	    	break;
	    case 8:
	    	animal = "��";
	    	break;
	    case 9:
	    	animal = "��";
	    	break;
	    case 10:
	    	animal = "��";
	    	break;
	    case 11:
	    	animal = "��";
	    	break;
	    default:
	    	break;
	    }
	    System.out.println(animal);
	  }

}//159��
