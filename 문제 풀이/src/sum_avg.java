import java.util.Scanner;

public class sum_avg {
    //세 개의 정수를 입력받아 합과 평균을 출력하는 프로그램을 작성하시오.(단 평균은 소수 이하를 버림하여 정수 부분만 출력한다.)
    //
    //입력 예
    //20 50 100
    //출력 예
    //sum = 170
    //avg = 56
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int sum=a+b+c;
        int avg=sum/3;
        System.out.println("sum = "+sum);
        System.out.println("avg = "+avg);
    }
}
