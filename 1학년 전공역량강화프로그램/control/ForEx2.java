package test.control;

/*[문제] 다중for문을 이용해서 소수를 구하시오
1-50사이의 소수 (1과 자기자신 이외의 약수를 갖지 않는 수)

[출력]
2 3 5 7 11 .....47
갯수: 15
*/

public class ForEx2 {
	public static void main(String[] args) {
        int cnt=0;
        int j;
        
        for(int i=2;i<=50;i++) {
        	for(j=2;j<i;j++) {
        		if(i%j==0) {
        			break;
        		}
        	}
        	if (i==j) {
        		System.out.println(i+" ");
        		cnt++;
        	}
        }
        
        System.out.println("\n갯수: "+cnt);
    }
}
