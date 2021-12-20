package test.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04_BufferedReaderEx {
	public static void main(String[] args) throws IOException {
		// //InputStream OutputStream은 1byte라서 한 글자씩 읽어올 수 있음
		// InputStreamReader isr=new InputStreamReader(System.in); //한 줄씩 읽기 위해 InputStreamReader를 사용
		// BufferedReader br=new BufferedReader(isr);//끊어지지않게 한 줄을 읽어들여라
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int age;
		float tall;
		double weight;
		char gender;
		
		System.out.print("이름:");
		name=br.readLine();
		
		System.out.print("나이:");
		age=Integer.parseInt(br.readLine());
		
		System.out.print("신장:");
		tall=Float.parseFloat(br.readLine());
		
		System.out.print("체중:");
		weight=Double.parseDouble(br.readLine());
		
		System.out.print("성별:");
		gender=br.readLine().charAt(0);
		
		System.out.println("나의 이름은 "+name+"입니다");
		System.out.println("나의 나이는 "+age+"세 입니다");
		System.out.println("나의 신장은 "+tall+" 입니다");
		System.out.println("나의 체중은 "+weight+" 입니다");
		System.out.println("나의 성별은 "+gender+" 입니다");
	}
}
