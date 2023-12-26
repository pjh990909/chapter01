package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		char ch01 = 'A';
		char ch02 = '박';
		
		System.out.println(ch01);
		System.out.println(ch02);
		
		//숫자를 넣으면 코드값으로 인식하여 그 코드값에 해당하는 문자가 나온다
		char ch03 = 65;
		System.out.println(ch03);
		
	    char ch04 = '3';
	    System.out.println(ch04);
	    
	    //char ch05 = "박"; <<""를 쓰면 오류가 난다,두글자 이상불가
	    
	    //String을 사용시 반드시 ""을 사용해야한다
	    String name = "박종희"; //1글자이상
	    System.out.println(name);
	    
	    //String name = '박';<<오류남(char바꾸던가 ""사용)
		
	}

}
