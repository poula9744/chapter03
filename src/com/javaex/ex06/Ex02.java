package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		//문자열 두 개를 합침 
/*		System.out.println(a.concat(b)); // abcd,efg 
		System.out.println(b.concat(a)); //,efg  abcd
		System.out.println(a+b); */
		
		a = a.concat(b);
		System.out.println(a); // abcd,efg 
		
		//공백 없애기
		a = a.trim();
		System.out.println(a); //abcd,efg

		//문자열 바꾸기
		a = a.replace("ab", "12");
		System.out.println(a); //12cd,efg
	
		//()안에 넣은 것을 기준으로 잘라서 나눠서 담아라
		String[] sArray = a.split(",");
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		} //12cd         efg
		
		System.out.println("-------------------------");
		
		String str = "Hello JAVA!";
		
		String result01 = str.substring(3);
		
		System.out.println(result01); //lo JAVA!
		System.out.println(str.substring(1, 7)); //ello J
		
		System.out.println("-------------------------");
		
		//__번째 방에서 하나만 데려오기
		char result02 = str.charAt(8);
		System.out.println(result02); //V
		
		System.out.println(str.toString()); //Hello JAVA!
		
		System.out.println("-------------------------");
		
		String s01 = new String ("안녕");
		String s02 = new String ("안녕");
		
		
		if(s01 == s02) {//주소 다름
			System.out.println("주소 같음");
		} else {
			System.out.println("주소 다름");
		}    
		 
		
		if(s01.equals(s02)) {//글자 같음
			System.out.println("글자 같음"); 
		} else {
			System.out.println("글자 다름");
		}   
		
		System.out.println("-------------------------");
		
		String s03 = null;
		
/*		if(s03.equals("안녕")) {
			//null값이 들어가면 오류남 
			System.out.println("출력");
		}
*/
		
		if("안녕".equals(s03)) {
			//반대로 넣으면 false뜨고 끝남 
			System.out.println("출력");
		}
	}

}
