package test.array;

import java.util.Scanner;

public class Ex02_factorial {
	
	public static int factorial1(int line) {
		int re=1;
		for(int i=1;i<=line;i++) {
			re*=i;
		}
		return re;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int line=scanner.nextInt();
		
		System.out.println(factorial1(line));
		
		scanner.close();
	}
	
}
