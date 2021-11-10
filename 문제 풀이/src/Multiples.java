import java.util.Scanner;

public class Multiples {
    //정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램을 작성하시오.
    //
    //* 주의
    // ')'와 '('사이에 공백이 1칸 있다.
    //(1,_1) 처럼 출력한다 : '_'는 공백
    //
    //입력 예
    //4
    //출력 예
    //(1, 1) (1, 2) (1, 3) (1, 4)
    //(2, 1) (2, 2) (2, 3) (2, 4)
    //(3, 1) (3, 2) (3, 3) (3, 4)
    //(4, 1) (4, 2) (4, 3) (4, 4)

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("("+i+", "+j+") ");
            }
            System.out.println();
        }
    }
}
