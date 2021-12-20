package test.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
Hello    <---입력
Hello
World    <---입력
W
o
r
l
d
20 30     <---입력
20 + 30 = 50
*/

public class Ex06_BufferedReaderEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String a=br.readLine();
		//System.out.println(a);
		
		//---------------------------------------------------------------------
		
		//char[]ch=br.readLine().toCharArray();
		
		//for(char c:ch) { //데이터가 없을 때 까지
		//	System.out.println(c);
		//}
		//for(int i=0;i<ch.length;i++) {
		//	System.out.println(ch[i]);
		//}
		
		//---------------------------------------------------------------------
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int i=Integer.parseInt(st.nextToken());
		int j=Integer.parseInt(st.nextToken());
		System.out.println(i + " + " + j + " = " + (i+j));
	}
}
