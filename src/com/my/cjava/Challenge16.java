package com.my.cjava;

public class Challenge16 {
	 public static void main(String[] args) {
	        // 입력값 대입
	        int basePay = Integer.parseInt(args[0]); // 시급
	        int workingHours= Integer.parseInt(args[1]);  // 일한 시간

	        // 월급 계산
	        int salary = basePay * workingHours;

	        // 출력
	        System.out.println(salary);
	    }

} //8번
