package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//안내문구
		System.out.println("이름을 입력해주세요");
		//이름
		System.out.print("이름:");
		//이름받기
		String name = sc.nextLine();
	    //안내
		System.out.println("나이를 입력해주세요");
		//나이
		System.out.print("나이:");
		//나이받기
		int age = sc.nextInt();
		//안내
		System.out.println("키를 입력해주세요");
		//키
		System.out.print("키:");
		//키받기
		double k = sc.nextDouble();
		//출력
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 키는 " + k + " 입니다.");
		//스캐너종료
		sc.close();

	}

}
