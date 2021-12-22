package test.basic;

public class Ex02_print {
	public static void main(String[] args) {
		
		System.out.println("나의 이름은 홍길동 입니다");
		
		String name="홍길동";
		int age=17;
		float weight=59.3f; //float는 f붙이기
		char gender='남'; //한 글자는 ''
		double tall=175.5;
		
		//print 줄바꿈 x
		//println 줄바꿈o
		
		System.out.print("나의 이름은 " + name + " 입니다\n");
		System.out.print("나의 나이는 "+ age + " 입니다\n");
		System.out.print("나의 체중은 " + weight + " 입니다\n");
		System.out.print("나의 성별은 " + gender + " 입니다\n");
		System.out.print("나의 키는 " + tall + " 입니다\n");
		
		System.out.println("나의 이름은 " + name + " 입니다");
		System.out.println("나의 나이는 "+ age + " 입니다");
		System.out.println("나의 체중은 " + weight + " 입니다");
		System.out.println("나의 성별은 " + gender + " 입니다");
		System.out.println("나의 키는 " + tall + " 입니다");
	}
}
