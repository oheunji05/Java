package test.control;

import java.util.Arrays;

/* [문제]아래 결과와 같이 행운의 로또번호 생성기를 만들려고 한다
1. 서로 겹치지 않는 (중복되지 않는) 숫자 6개 생성
2. 각 숫자는 1~45 범위내의 숫자
3. 매번 실행시 다른 숫자 출력
   ---> 랜덤수 : Math사용 
4. 다섯회 출력
5. 오름차순 출력
6. 1차원 배열 이용

[결과]
1회: 8  15 27 29 33 41 
2회: 5  8  9  24 29 44 
3회: 17 20 23 27 39 42 
4회: 1  4  18 28 29 45 
5회: 3  10 32 36 44 45 
*/

public class Lotto2 {
	public static void main(String[] args) {
		 int[] lotto=new int[6];
	      
	      for(int i=0; i<5; i++) {
	         for(int j=0; j<6; j++){
	            lotto[j]=(int)(Math.random()*45)+1;
	         
	            for(int k=0; k<j; k++) {
	               if(lotto[k] == lotto[j]) {
	                  j--;
	                  break;
	               }
	            }
	         }
	         Arrays.sort(lotto);              //오름차순 정렬
	         System.out.print((i+1)+"회: ");
	         
	         for(int j=0; j<lotto.length; j++) {
	            System.out.printf("%-3d", lotto[j]);
	         }
	         System.out.println();
	      }

	}
}
