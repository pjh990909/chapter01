package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] leftArray = new int[]{10,20,30};
		int[] rightArray = new int[]{15,50,300};
		
		if(leftArray.length == rightArray.length) {
			//방의갯수가 같으면
			//세부검사
		    for(int i=0;i<leftArray.length;i++) {
			    if(leftArray[i]!=rightArray[i]) {
				    System.out.println(i+"번쨰 값이 다릅니다");
			    }
		    }	
			
		}else {
			System.out.println("두배열의 크기가 다릅니다.");
		}
		
		
		
		
		
		
		
		
		

	}

}
