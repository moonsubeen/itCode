package com.my.cjava;

public class Challenge7 {
	 public static double calculateBMI(double weight, double tall) {
		    /* bmi ������ ����Ͽ� ��ȯ�Ͻÿ� */
		    return weight / (tall * tall);
		  }

		  public static void printBMIClassification(double bmi) {
		    System.out.printf("BMI: %.2f\n", bmi);
		    /* ���ǽ��� ����Ͽ� �񸸵� ����� ������ּ��� */
		    if (bmi > 30)
		        System.out.println("�� �Դϴ�.");
		      else if (bmi >= 25)
		        System.out.println("��ü�� �Դϴ�.");
		      else if (bmi >= 18.5)
		        System.out.println("���� �Դϴ�.");
		      else
		        System.out.println("��ü�� �Դϴ�.");
		  }

		  public static void main(String[] args) {
		    // ü��, Ű �Է�
		    double weight = Double.parseDouble(args[0] + "." + args[1]);
		    double tall = Double.parseDouble(args[2] + "." + args[3]);
		    // BMI ���� ���
		    double bmi = calculateBMI(weight, tall);
		    // �񸸵� ��� ���
		    printBMIClassification(bmi);
		  }

}//16��
