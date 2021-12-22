package test.control;

public class IfEx1 {
	/*public static void main(String[] args) {
		//if else if 문
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 나머지 F
		int score=78;
		char grade;
		
		if(score>=90) {
			grade='A';
		}
		else if(score>=80) {
			grade='B';
		}
		else if(score>=70) {
			grade='C';
		}
		else if(score>=60) {
			grade='D';
		}
		else {
			grade='F';
		}
	
	}*/
	
	public static void main(String[] args) {
		int score=95;
		char grade;
		
		if(score/10==10 || score/10==9) {
			grade='A';
		}
		else if(score/10==8) {
			grade='B';
		}
		else if(score/10==7) {
			grade='C';
		}
		else if(score/10==6) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.println("나의 점수는 "+score+"점 이고, 등급은 "+grade+"입니다");
	}
}
