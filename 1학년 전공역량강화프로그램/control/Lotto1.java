package test.control;

import java.util.Arrays;

/*[문제]아래 결과와 같이 행운의 로또번호 생성기를 만들려고 한다
1. 서로 겹치지 않는 (중복되지 않는) 숫자 6개 생성
2. 각 숫자는 1~45 범위내의 숫자
3. 매번 실행시 다른 숫자 출력
   ---> 랜덤수 : Math사용 
4. 오름차순 정렬

[결과]
9 11 16 20 21 40
*/

public class Lotto1 {
	public static void main(String[] args) {
		int[]lotto=new int[6];
		int tmp;
		
		for(int i=0;i<6;i++) {
			lotto[i]=(int)(Math.random()*45+1);
			
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		//Arrays.sort(lotto)                            //오름차순
		//Arrays.sort(lotto, Collection.reverseOrder());  //내림차순
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(lotto[j]>lotto[j+1]) {
					tmp=lotto[j+1];
					lotto[j+1]=lotto[j];
					lotto[j]=tmp;
				}
			}
		}
		
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
	}
}
