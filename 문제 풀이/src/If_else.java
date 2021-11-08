import java.util.Scanner;

public class If_else {
    //두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
    //
    //입력 예
    //4.3 3.5
    //출력 예
    //B
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a= scanner.nextDouble();
        double b=scanner.nextDouble();
        if (a >= 4.0 && b >= 4.0){
            System.out.print("A");
        }
        else if (a >= 3.0 && b >= 3.0){
            System.out.print("B");
        }
        else {
            System.out.print("C");
        }
    }
}
