package test.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//자료형: byte(1), short(2), int(4), long(8) ==>정수
//		float(4), double(8) ==>실수
//		boolean ==> (true, false)

public class DoWhileEx1 {
	public static void main(String[] args) throws IOException {
		//while을 이용해여 "Hello World"를 5번 출력
		int i=0;
		while(i<5) {
			System.out.println("Hello World");
			i++;
		}
		
		//do while을 이용하여 "I like Algorithm"을 5번 출력
		//do while은 무조건 한 번은 실행 (조건이 마지막에 있어서)
		int j=0;
		do {
			System.out.println("I like Algorithm");
			j++;
		}while(j<5);
		
		//점수를 입력받아 0~100점 사이인 경우만 출력하시오 (do while)
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int score;
		
		do {
			System.out.println("점수를 입력하시오: ");
			score=Integer.parseInt(br.readLine());
		}while(score<0 || score>100);
		
		System.out.println("당신의 점수는 "+score+"점 입니다");
	}
}
