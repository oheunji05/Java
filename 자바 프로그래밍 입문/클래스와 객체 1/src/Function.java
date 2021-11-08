import java.awt.*;

public class Function {

    //함수 정의
    // int(함수반환형) add(함수이름) (int num1,int num2(매개변수)){
    // int result;
    // result=num1+num2;
    // return result;
    // }

    //함수 장점
    //함수를 사용하면 기능을 나누어 코드를 효율적으로 구현할 수 있다.
    //기능별로 함수를 구현해 놓으면 같은 기능을 매번 코드로 만들지 않고 그 기능의 함수를 호출하면 되니 편리하다.

    public static void main(String[] args) {
        int num1=10;
        int num2=20;

        int sum=add(num1,num2); //add함수 호출
        System.out.println(num1+"+"+num2+"="+sum+"입니다");
    }

    public static int add(int num1,int num2){
        int result=num1+num2;
        return result; //결과 값 반환
    }
}
