package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		double v01 = 5/4; //정수끼리는 정수값만 나온다
		System.out.println(v01);
		
		double v02 = (double)5/4;
		System.out.println(v02);
		
		double v03 = 5/(double)4;
		System.out.println(v03);
		
		double v04 = (double)5/(double)4;
		System.out.println(v04);
		//하나라도 실수인 경우 실수
		int v05 = (int)1.3+(int)1.8;
		System.out.println(v05);
		
		int v99 = (int)(5/(double)4);
		System.out.println(v99);
		
		int v06 = (int)(1.3+1.8);
		System.out.println(v06);
		
		
		
		
		
	}

}
