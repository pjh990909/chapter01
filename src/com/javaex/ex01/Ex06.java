package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		//일반적인 경우
		double pi = 3.14;
		double result = pi*5*5;
		System.out.println(result);
		
		//pi 값을 변경한는 경우
		pi = 3.141591;
		double circleArea = pi*5*5;
		System.out.println(circleArea);
		
		////////////////////////////
		
		//상수로 정의할때
		final double PI = 3.14;
		double result02 =PI*5*5;
		System.out.println(result02);
		//PI = 3.141591;로 바꿀라고 시도하면 오류남
		//final 사용시 이름을 대문자로 사용 ex)PI
		//상수값을 확인할때 오류 확인
		double circleArea2 = PI*5*5;
		System.out.println(circleArea2);
		
		
		
	}

}
