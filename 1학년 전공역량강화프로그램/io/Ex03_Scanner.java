package test.io;

import java.util.Scanner;

/* [문제] 2개의 숫자중 큰수를 출력하시오
5
3 7
5 4
9 10
2 -1
8 6

#1 7
#2 5
#3 10
#4 2
#5 8
*/

public class Ex03_Scanner {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n;
		int n1,n2;
		
		n=scanner.nextInt();
		
		int[]re=new int[n];
		
		for(int i=0;i<n;i++) {
			n1=scanner.nextInt();
			n2=scanner.nextInt();
			if(n1>n2) {
				re[i]=n1;
			}
			else if(n2>n1) {
				re[i]=n2;
			}
		}
		for (int i=0;i<n;i++) {
			System.out.println("#"+(i+1)+" "+re[i]);
		}
		
		
	}
}
