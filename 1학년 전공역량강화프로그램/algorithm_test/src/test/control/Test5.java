package test.control;

import java.util.Scanner;

/*[문제] 2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램
(두자리의 난수: 10 - 99, Math클래스 사용)

[출력]
83  <---컴퓨터가 만든 수(화면에는 보이지 않아야 함)
*** 숫자 맞추기 게임을 시작합니다 *** 
숫자 입력: 50
컴퓨터의 숫자가 더 큽니다.

숫자 입력: 90
컴퓨터의 숫자가 더 작습니다.
:

숫자 입력: 83
축하합니다.3번만에 맞추셨습니다.

한번 더 할까요(Y/y): n
**수고 하셨습니다 **
*/

public class Test5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=(int)(Math.random()*100+10);
		
		int num;
		int cnt=0;
		String more;
		
		System.out.println("*** 숫자 맞추기 게임을 시작합니다 *** ");
		
		while(true) {
			
			System.out.print("숫자 입력: ");
			num=scanner.nextInt();
			
			if(num==n) {
				cnt++;
				System.out.println("축하합니다."+cnt+"번만에 맞추셨습니다.");
				System.out.print("한번 더 할까요(Y/N): ");
				
				more=scanner.next();
				
				if (more=="N") {
					System.out.println();
					System.out.println("**수고 하셨습니다 **");
					return;
				}
				
				else {
					continue;
				}
			}
			
			else if (n>num) {
				cnt++;
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
				System.out.println();
			}
			
			else if (n<num) {
				cnt++;
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
				System.out.println();
			}
			
		}
	}
}
