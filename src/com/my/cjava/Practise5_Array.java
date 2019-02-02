package com.my.cjava;

public class Practise5_Array {
	public static void main(String[] args) {
		
//		/********************  1차원 배열  *******************************
//		   arr[5] => int    | int    | int    | int    | int
//		          => arr[0] | arr[1] | arr[2] | arr[3] | arr[4]
//		**************************************************************/
//				
//		// 배열 초기화 (primitive type)
//		int[] arr1 = new int[5];	// default 0 (Java Spec)
//		int[] arr2 = {2,4,6,8,10};
//		int[] arr3 = new int[] {1,2,3,4,5};
//		
//		// 배열 원소 접근
//		System.out.println("arr1[0]: " + arr1[0]);
//		System.out.println("arr2[0]: " + arr2[0]);
//		System.out.println("arr3[0]: " + arr3[0]);
//		
//		// 배열 길이
//		System.out.println("arr1 size: " + arr1.length);
//		System.out.println("arr2 size: " + arr2.length);
//		System.out.println("arr3 size: " + arr3.length);
//		
//		
//		int[] arr4 = new int[100];
//		for(int i = 1; i<100; i++)
//		{
//			arr4[i] = arr4[i-1] + i;
//		}
//		for(int i = 0; i<100; i++)	
//		{
//			System.out.println(arr4[i]);
//		}
		
		/********************  2차원 배열  *******************************
		   arrK[행][열]
		   arrK[3][]  => int[]   | int[]   | int[]
		              => arrK[0] | arrK[1] | arrK[2]
		             
		   arrK[0][2] => int        | int 
		              => arrK[0][0] | arrK[0][1]
		   arrK[1][1] => int        
		              => arrK[1][0]
		   arrK[2][3] => int        | int        | int 
		              => arrK[2][0] | arrK[2][1] | intK[2][2]
		**************************************************************/
				
		
		// 2차원 배열 초기화
		int[][] arrK = new int[3][]; // 길이가 3인 행
		arrK[0] = new int[2]; // 0번째 행의 열? 길이가 2인 열
		arrK[1] = new int[1]; // 1번째 행의 열? 길이가 1인 열
		arrK[2] = new int[3]; // 2번째 행의 열? 길이가 3인 열
		System.out.println("arrK: " + arrK.length);
		
		// 배열 길이
		int i = 0;
		while(i<arrK.length) {
			System.out.println("arrK i: " + arrK[i].length);		
			i++;
		}
	
		/**
		 * arrk[][]
		 * 
		 * [0][0] [0][1]     		=> 0 1
		 * [1][0]			 		=> 0
		 * [2][0] [2][1] [2][2]		=> 0 1 2
		 */
		i=0;
		while(i<arrK.length) { //3
			for(int j = 0; j<arrK[i].length; j++) {// 2 1 3
				arrK[i][j] = j;
				System.out.print(arrK[i][j] + " ");
			}
			i++;
		}
	}

}
