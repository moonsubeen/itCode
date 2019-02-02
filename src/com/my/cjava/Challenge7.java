package com.my.cjava;

public class Challenge7 {
	 public static double calculateBMI(double weight, double tall) {
		    /* bmi 지수를 계산하여 반환하시오 */
		    return weight / (tall * tall);
		  }

		  public static void printBMIClassification(double bmi) {
		    System.out.printf("BMI: %.2f\n", bmi);
		    /* 조건식을 사용하여 비만도 결과를 출력해주세요 */
		    if (bmi > 30)
		        System.out.println("비만 입니다.");
		      else if (bmi >= 25)
		        System.out.println("과체중 입니다.");
		      else if (bmi >= 18.5)
		        System.out.println("정상 입니다.");
		      else
		        System.out.println("저체중 입니다.");
		  }

		  public static void main(String[] args) {
		    // 체중, 키 입력
		    double weight = Double.parseDouble(args[0] + "." + args[1]);
		    double tall = Double.parseDouble(args[2] + "." + args[3]);
		    // BMI 지수 계산
		    double bmi = calculateBMI(weight, tall);
		    // 비만도 결과 출력
		    printBMIClassification(bmi);
		  }

}//16번
