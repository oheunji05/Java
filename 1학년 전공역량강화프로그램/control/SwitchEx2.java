package test.control;

import java.util.Scanner;

/* [문제] Scanner 또는 BufferedReader를 이용하시오. 데이터를 입력받아 switch문으로 다음과 같이 출력하시오
(입력데이터)
홍길동 A

(출력데이터)
홍길동은 A학점 입니다
등급은 Gold입니다
 
(조건)
A는 Gold
B,C는 Silver
나머지는 Bronze    
*/
public class SwitchEx2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name;
		String score;
		String grade;
		
		name=scanner.next();
		score=scanner.next();
		
		switch(score) {
			case "A": grade="Gold"; break;
			case "B": grade="Silver"; break;
			case "C": grade="Silver"; break;
			default : grade="Bronse"; break;
		}
		
		System.out.println(name+"은 "+score+"학점 입니다");
		System.out.println("등급은 "+grade+"입니다");
		
	}
}
