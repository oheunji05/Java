package test.basic;

//parseInt("문자열") --> 정수
//주의 ) 문자열은 모두 숫자로 구성되어 있어야 함

public class Ex05_ParseInt {
	
	public static void main(String[] args) {
		String a="100";
		String b="200";
		
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		
		System.out.println(a+b); //100200
		System.out.println(x+y); //300
	}
}
