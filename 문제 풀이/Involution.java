import java.util.Scanner;

public class Involution {
    //10 이하의 두 정수가 주어진다.
    //
    //이를 입력 받아서 첫 번째 수를 두 번째 수만큼 거듭제곱하여 나온 값을 리턴하는 함수를 작성하여
    //
    //다음과 같이 출력하는 프로그램을 작성하시오.
    //
    //입력 예
    //2 10
    //출력 예
    //1024
    public static int involution(int n1,int n2){
        int result = 1;
        for(int i=0;i<n2;i++){
            result=result*n1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1,n2;
        n1=scanner.nextInt();
        n2= scanner.nextInt();
        System.out.println(involution(n1,n2));
    }
}
