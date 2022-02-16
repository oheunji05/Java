import java.util.Scanner;

public class Increasing_operator {
    //한 개의 정수를 입력 받아서 후치증가 연산자를 사용하여 출력한 후 전치 증가 연산자를 사용하여 출력하는프로그램을 작성하시오.
    //
    //입력 예
    //5
    //출력 예
    //5
    //7

    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        n= scanner.nextInt();
        System.out.println(n++);
        System.out.println(++n);
    }
}
