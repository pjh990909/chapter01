package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] arrA = new int [3]; //0x777
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB = new int [3];//0x123
		
		for(int i=0;i<arrA.length;i++) {
			arrB[i]=arrA[i];
		}
		
		//A배열출력
		for(int i=0;i<arrA.length;i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("=================");
		//B배열출력
		for(int i=0;i<arrB.length;i++) {
			System.out.println(arrB[i]);
		}
		System.out.println("===================");
		
		arrA[2]=10000;
		
		//A배열만 값이 다른지 확인
		//A배열출력
		for(int i=0;i<arrA.length;i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("===================");
		//B배열출력
		for(int i=0;i<arrB.length;i++) {
			System.out.println(arrB[i]);
		}
		
		
		
		
		

	}

}
