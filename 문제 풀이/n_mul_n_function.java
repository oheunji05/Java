import java.util.Scanner;

public class n_mul_n_function {
    //100 미만의 정수만 입력된다. 정수 n을 입력받아 n x n 크기의 숫자사각형을 출력하는 프로그램을 작성하시오.
    //
    //이때 정수 n을 전달받아 숫자 정사각형을 출력하는 함수를 작성하고, 입력받은 정수 n을 함수로 전달하여 출력한다.
    //
    //입력 예
    //4
    //출력 예
    //1 2 3 4
    //5 6 7 8
    //9 10 11 12
    //13 14 15 16

    public static void n_mul_n_function(int n){
        int a=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a++;
                System.out.print(a +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        n= scanner.nextInt();
        n_mul_n_function(n);
    }
}
