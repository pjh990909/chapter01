package com.javaex.ex01;

public class ex11 {

	public static void main(String[] args) {
		
		//증감 연산자
		int b= 10;
		//b++,b--는 선출력후 값이 올라감
		System.out.println(b);
		System.out.println(b++);
		System.out.println(b++);
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b--);
		System.out.println(b);
		
		System.out.println("------------------");
		
		int no = 10;
		//System.out.println(++no + 3);//14
		//System.out.println(no-- + 3);//13
		System.out.println(no);
		System.out.println(no-- + --no); //18
		
		
		
		
		

	}

}
