package test.io;

import java.util.Scanner; //ctrl + shift + o

//Scanner를 이용한 입력받기
/*
[입력]
3
3 4 5 1 3 4 5 1 4 5
6 7 8 5 4 2 1 5 6 7
4 5 6 7 2 5 7 6 1 1

[출력]
#1 35
#2 51
#3 44
*/

public class Ex02_Scanner {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int cnt=scanner.nextInt(); //넣은 값\n\r 에서 넣은 값만 가지고 옴
		scanner.nextLine();// \n\r을 가지고 오지 않기 위해 사용. 사용하지 않으면 \n\r을 가지고 옴. 에러
		
		int[]sum=new int[cnt]; //방 세 개를 만든다.
		
		for(int i=0;i<cnt;i++) {
			String[]data=scanner.nextLine().split(" "); //한 줄을 가지고 온 다음 data라는 방에다가 숫자들을 저장.  split:공백을 기준으로 쪼갠다
			
			for(int j=0;j<data.length;j++) {
				sum[i]+=Integer.parseInt(data[j]); //문자형인 숫자를 정수형으로 만듦
			}
		}
		for (int i=0;i<cnt;i++) {
			System.out.println("#"+(i+1)+" "+sum[i]);
		}
	}
}
