package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		//cmd로 하는거
		for(int i =0;i<args.length;i++) {
			System.out.println(i+"번째방의 값:"+args[i]);
		}
		
		/*수동으로 실행시킬때
		
		패키지 직전
		...../bin 이동
		
		java com.javaex.ex05.Ex09 i am park jong hee(쓰고 싶은 내용)
		
		java com.javaex.ex.Ex09 -h
		[-h]:도움말
		[-v]:버전정보
		[-m]:만든사람
		
		*/
		if(args[0].equals("-h")) {
			System.out.println("[-h]:도움말");
			System.out.println("[-v]:버전정보");
			System.out.println("[-m]:만든사람");
		}else if(args[0].equals("-v")) {
			System.out.println("버전1.1");
		}else if(args[0].equals("-m")) {
			System.out.println("만든사람:박종희");
		}else {
			System.out.println("옵션을 확인하세요");
		}
		
		
		
		

	}

}
