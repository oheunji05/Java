import java.util.Scanner;

public class String_function {
    //문자열 "~!@#$^&*()_+|" 를 출력하는 함수를 작성하고 정수를 입력받아 입력받은 수만큼 함수를 호출하는 프로그램을 작성하시오.
    //
    //* 주의 : 문자열을 잘 확인하세요. ('%'이 없음)
    //* 문자열을 복사해서 출력해도 됩니다.
    //
    //입력 예
    //3
    //출력 예
    //~!@#$^&*()_+|
    //~!@#$^&*()_+|
    //~!@#$^&*()_+|
    public static void String_function(int n){
        for(int i=0;i<n;i++){
            System.out.println("~!@#$^&*()_+|");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        String_function(n);
    }
}
