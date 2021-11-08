import java.util.Scanner;

public class True_False {
    //민수와 기영이의 키와 몸무게를 입력받아 민수가 키도 크고 몸무게도 크면 1 그렇지 않으면 0을 출력하는 프로그램을 작성하시오.
    //(JAVA는 1 이면 true, 0 이면 false를 출력한다.)
    //
    //입력 예
    //150 35
    //145 35
    //출력 예
    //0
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int minHeight=scanner.nextInt();
        int minWeight=scanner.nextInt();
        int kiHeight= scanner.nextInt();
        int kiWeight= scanner.nextInt();
        if(minHeight>kiHeight&&minWeight>kiWeight){
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }
    }
}
