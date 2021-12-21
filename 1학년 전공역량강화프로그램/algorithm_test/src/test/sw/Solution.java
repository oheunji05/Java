package test.sw;

import java.util.Scanner;

/*public class Solution {
	//다음과 같이 두 개의 숫자 N, M이 주어질 때, N의 M 거듭제곱 값을 구하는 프로그램을 재귀호출을 이용하여 구현해 보아라.
	//2 5 = 2 X 2 X 2 X 2 X 2 = 32
	//3 6 = 3 X 3 X 3 X 3 X 3 X 3 = 729
	
	public static int pow(int n1,int n2) {
		int re=1;
		for(int i=0;i<n2;i++) {
			re*=n1;
		}
		return re;
	}
	
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		for(int i=1;i<=10;i++) {
			int test=scanner.nextInt();
			int n1=scanner.nextInt();
			int n2=scanner.nextInt();
			System.out.println("#" + test + " " + pow(n1,n1));
		}
	}*/

public class Solution {
	
	//팩토리얼 재귀함수 
	public static int pow(int n1,int n2) {
		if(n2==0) {
			return 1;
		}
		return n1 * pow(n1,n2-1);
	}
	
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		for(int i=1;i<=10;i++) {
			int test=scanner.nextInt();
			int n1=scanner.nextInt();
			int n2=scanner.nextInt();
			System.out.println("#" + test + " " + pow(n1,n1));
		}
	}
	
	
	
	
}
