package test.basic;

public class Test2 {
	/*[문제] 각각 변수를 만들어 다음과 같이 완성하시오
	println으로 각각 출력하시오

	이름 : 강호동
	국어 : 85
	영어 : 73
	수학 : 68
	총점 : 226점
	평균 : 75.33점
	*/

	public static void main(String[] args) {
		String name="강호동";
		int lan=85;
		int eng=73;
		int mat=68;
		double sum=lan+eng+mat;
		double avg=sum/3;
		
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + lan);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.printf("총점 : %.0f점\n",sum);
		System.out.printf("평균 : %.2f점",avg);
	}
}
