package test.io;

import java.util.Scanner;

//입력
//1. Scanner - jdk 1.5이상, 성능이 BufferedReader 보다 낮음
//2. BufferedReader - 성능이 더 좋음

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name;
		int age;
		float tall;
		double weight;
		char gender;
		
		System.out.println("이름 : ");
		name=scanner.next();
		
		System.out.println("나이 : ");
		age=scanner.nextInt();
		
		System.out.println("신장 : ");
		tall=scanner.nextFloat();
		
		System.out.println("체중 : ");
		weight=scanner.nextDouble();
		
		System.out.println("성별 : ");
		gender=scanner.next().charAt(0);
		
		System.out.printf("%s", name);
		System.out.printf("%d",age);
		System.out.printf("%.2f",tall);
		System.out.printf("%.2f",weight);
		System.out.printf("%c",gender);
	}
}
