package test.io;

public class Ex07_StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("hello ");
		sb.append("World").append("!!!");
		System.out.println(sb.toString());
		
		//!!!빼고 출력
		sb.setLength(sb.length()-3);
		System.out.println(sb.toString());
		
		//앞에 aaa추가
		sb.insert(0,"aaa");//0번지에 aaa를 추가
		System.out.println(sb.toString());
		
		//뒤집어 출력
		sb.reverse();
		System.out.println(sb.toString());
	}
}
