package test.basic;

//+의 의미: 더하기 and 연결하기 and 단항연산자

public class Ex01_print {
	public static void main(String[] args) {
		int a=9,b=8;
		
		System.out.println("9 + 8 = "+ a+b); //연결
		System.out.println("9 + 8 = "+ (a+b)); //더하기
		// +-(3) = +1 * -3 = -3 // +1은 단항연산자
		System.out.println(a+" + "+b+" = "+(a+b));
	}
}
