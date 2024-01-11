package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		
		int a = 3; //문제 없음
		System.out.println(a); //toString() 안 됨 
		
		Integer i = new Integer(3);
		System.out.println(i.toString());

		Integer sum = new Integer(3) + new Integer(3);
		System.out.println(sum.toString());
		
		Integer v01 = 3; //자동 박싱
		System.out.println(v01.toString());
		
		int v02 = i; //i는 주소지만 v02가 담긴다 --> 자동 언박싱 
		System.out.println(v02);
		
		System.out.println("=============");
		
		
		//문자열 --> 정수 
/*
		Integer r01 = 100; <<- 쓸데없이 메모리를 올리는 행위는 안 하는 게 좋음
		int result = r01.parseInt("123456789");
		System.out.println(result + 3); //123456792                                */

		int result = Integer.parseInt("12345");
		System.out.println(result + 3); //12348
		
		
		//숫자 --> 문자열 
/*
		String str = "안녕하세요"; <<- 쓸데없이 메모리 올리기
		String result02 = str.valueOf(555);
		System.out.println(result02 + 2); //5552                                     */
		
		String result02 = String.valueOf(999);
		System.out.println(result02 + 2); //9992
		
		String result03 = "" + 999;     //문자열"" + 숫자열 == 문자열
		System.out.println(result03 + 2); //9992
		
		System.out.println("999" + 2); //9992

	}

}
