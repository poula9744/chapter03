package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		System.out.println(obj.getClass()); //어떤 클래스인지 알려줌
		System.out.println(obj.toString()); //java.lang.Object@58ceff1
		System.out.println(obj.hashCode()); //일단 주소라고 알자
		System.out.println(obj.equals(obj)); //비교(두 개 필요) --> 같냐
		
		System.out.println("-----------------------------"); 
		
		//getClass() : 클래스 정보
		System.out.println(obj.getClass()); 
		
		//toString()
		System.out.println(obj.toString());
		System.out.println(obj); //println이 가지고 있는 기능 (toString()으로 찍게 되어 있음)
		
		//hashCode() : 일단 주소라고 알기
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		
		//equals() : 정의한 값 비교(두 개 필요) --> 같냐
		System.out.println(obj01.equals(obj01)); //true
		System.out.println(obj01.equals(obj02)); //false
		System.out.println(obj01.equals(obj03)); //false
		
		System.out.println(obj01 == obj02); // <<-- 주소값 비교
	}

}
