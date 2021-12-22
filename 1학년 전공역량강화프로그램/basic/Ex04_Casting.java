package test.basic;

//형변환: 자동형변환, 강제형변환
public class Ex04_Casting {
	public static void main(String[] args) {
		//자동형변환
		int a=100;
		long b=a;
		System.out.println(a + " " + b);
		
		//강제형변환
		float c=75.3f;
		int d=(int)c;
		System.out.println(c + " " + d);
		
		int salary=857650;
		double tax=0.033;
		int result=salary-(int)(salary*tax);
		System.out.println("세금을 제외한 급여: "+result);
		
		int k=87, e=88, m=75;
		double avg=(double)(k+e+m)/3; //강제형변환
		double avg2=(k+e+m)/3.0; //자동형변환
		System.out.printf("평균: %.2f점\n",avg);
		System.out.printf("평균: %.2f점",avg2);
	}
}