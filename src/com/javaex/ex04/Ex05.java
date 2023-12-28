package com.javaex.ex04;

public class Ex05 {

	public static void main(String[] args) {
		
		int num = 0;
		int max = 100;
		for (int i=1;i<=max;i++) {
			
			System.out.println(i + " 까지의 합은 " + (num+i));
			num = num+i;
			
		}
		
		System.out.println("1부터" + max +"까지의 정수의 합은 " + num + " 입니다.");
			
		
		
		
		
		

	}

}
