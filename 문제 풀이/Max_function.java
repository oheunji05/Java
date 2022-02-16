import java.util.Scanner;

public class Max_function {

    //세 개의 정수를 전달받아 최대값을 구하여 리턴하는 함수를 작성하고,
    //
    //세 정수를 입력받아 최대값을 출력하는 프로그램을 작성하시오.
    //
    //입력 예
    //-10 115 33
    //출력 예
    //115

    private static int max=0;
    //private :다른 클래스에서 접근 불가 / 같은클래스에서는 가능
    //static : static 끼리만 사용 가능 (지금 코드의 경우 main, max_function 함수 모두 static)

    public static int max_function(int n1,int n2,int n3){

        if (n1>n2&&n1>n3){
            max=n1;
        }
        else if (n2>n1&&n2>n3){
            max=n2;
        }
        else if(n3>n1&n3>n2){
            max=n3;
        }
        else {
            max=n1;//모든 숫자가 같을 경우 n1=n2=n3 이니까 아무거나 출력
        }
        return max;
    }

    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner scanner=new Scanner(System.in);
        n1= scanner.nextInt();
        n2= scanner.nextInt();
        n3= scanner.nextInt();
        System.out.println(max_function(n1,n2,n3));
    }
}
