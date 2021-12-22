package test.basic;

public class Ex03_print {
	public static void main(String[] args) {
		String name="홍길동";
		int age=17;
		float weight=59.3f; 
		char gender='남'; 
		double tall=175.5;
		
		System.out.printf("나의 이름은  %s 입니다\n",name);
		System.out.printf("나의 나이는 %d 입니다\n",age);
		System.out.printf("나의 체중은 %.1f 입니다\n",weight);
		System.out.printf("나의 성별은 %c 입니다\n",gender);
		System.out.printf("나의 키는 %.1f 입니다\n",tall);
	}
}
