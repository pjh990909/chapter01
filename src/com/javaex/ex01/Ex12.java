package com.javaex.ex01;

public class Ex12 {

	public static void main(String[] args) {
		
		//관계 연산자
		int n1 = 5;
		int n2 = 3;
		
		boolean result = n1<n2;
		System.out.println(result);
		//어느쪽이 더 큰가
		System.out.println(n1<n2); //f
		System.out.println(n1>n2); //t
		//같거나 크다
		System.out.println(n1<=n2); //f
		System.out.println(n1>=n2); //t
		System.out.println(3>=n2); //t
		//같다,다르다
		System.out.println(n1==n2); //f
		System.out.println(n1!=n2); //t
		

	}

}
