package test.control;

import java.util.Scanner;

/*[문제] 중첩if를 이용하여 프로그램을 작성하시오
3과목의 점수를 입력받아서 합격이지 불합격인지 출력하시오
3개의 과목이 전부 40이상이어야 하고 평균이 60이어야 "합격" 출력
평균이 60이 넘지만 1개의 과목이라도 40 미만이면 "과락으로 불합격" 출력
평균이 60미만이면 "불합격" 출력

[실행결과]
국어점수입력 : 75  
영어점수입력 : 80  
수학점수입력 : 100
결과 = 합격

국어점수입력 : 95  
영어점수입력 : 80  
수학점수입력 : 38
결과 = 과락으로 불합격

국어점수입력 : 45  
영어점수입력 : 47 
수학점수입력 : 65
결과 = 불합격 
*/
public class IfEx2 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int k,e,m;
		
		System.out.print("국어점수입력 : ");
		k=scanner.nextInt();
		
		System.out.print("영어점수입력 : ");
		e=scanner.nextInt();
		
		System.out.print("수학점수입력 : ");
		m=scanner.nextInt();
		
		int avg=(k+e+m)/3;
		if(k>=40 && e>=40 && m>=40 && avg>=60) {
			System.out.println("결과 = 합격");
		}
		
		else if(avg>=60) {
			System.out.println("결과 = 과락으로 불합격");
		}
		
		else {
			System.out.println("결과 = 불합격");
		}
	}
}
