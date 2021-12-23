package test.array;

import java.util.Scanner;

public class Ex03_fibonacciTest {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int k=scanner.nextInt();
		
		int num1=0,num2=1,sum=1;
		
		for(int i=0;i<k;i++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
		}
		
		scanner.close();
		
	}
}
