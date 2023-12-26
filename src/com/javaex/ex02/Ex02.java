package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//스캐너 준비
		Scanner sc = new Scanner(System.in);
		
		//안내출력
		//이름출력
		//이름 입력받기
		//안내출력
		//나이출력
		//나이 입력받기
		//결과 출력
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		String name1 = sc.nextLine();
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		int age = sc.nextInt();
		System.out.println("당신의 이름은 "+ name1 + " 나이는 " + age + " 입니다.");
		//스캐너 종료
		sc.close();
		
		

	}

}
