package test.control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*[문제]성적처리프로그램
중간고사,기말고사,레포트,출석점수를 BufferedReader로 입력받아서 계산하시오

조건1)
 (중간+기말)/2  ---> 60%
   과제                   ---> 20%
   출석                   ---> 20%
     
조건2)if~else if문이용
 90이상  'A'학점
 80이상 'B'학점         
 70이상 'C'학점        
 60이상 'D'학점        
  나머지 'F'학점
           
조건3) switch 이용 
 A,B학점  ---->"excellent"
 C,D학점  ---->"good"
 F학점     ---->"poor"
-------------------------------------------------------------
[입력화면]
90 89 99 100   --중간, 기말, 과제, 출석

[출력화면]
중간고사 : 90
기말고사 : 89
과제점수 : 99
출석점수: 100

성적=93.20      <---소수점 2째자리까지
학점=A          
평가=excellent
*/
public class IfSwitchEx {
	public static void main(String[] args) {
	  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	}
}

//-------------------------------------------------------------------------

/*public class IfSwitchEx {
	public static void main(String[] args) {
	  
		char check='E';
		
		//switch(check) {
		//case 'e':
		//case 'E': System.out.println("Excellent"); break;
		//case 'g':
		//case 'G': System.out.println("Good"); break;
		//default : System.out.println("Bad"); break;
		//}
		
		if(check=='e'||check=='E') {
			System.out.println("Excellent");
		}
		else if(check=='g'||check=='G') {
			System.out.println("Good");
		}
		else {
			System.out.println("Bad");
		}
	}
}*/
