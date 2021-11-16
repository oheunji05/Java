import java.util.Scanner;

public class Arithmetic {
    //정수의 연산식을 입력받아 연산을 위한 함수를 호출하여
    //
    //4칙연산(+ - * /)의 연산결과를 출력하는 프로그램을 작성하시오.
    //
    //('/'의 경우는 정수 부분만 출력하고 4칙연산 이외의 연산 결과는 0으로 한다.)
    //( if_else 문으로 작성하세요.)
    //
    //입력 예
    //10 + 20
    //출력 예
    //10 + 20 = 30
    public static void arithmetic(int n1,String c,int n2){
        if(c.equals("+")){
            System.out.println(n1+" + "+n2+" = "+(n1+n2));
        }
        else if (c.equals("-")){
            System.out.println(n1+" - "+n2+" = "+(n1-n2));
        }
        else if (c.equals("*")){
            System.out.println(n1+" * "+n2+" = "+(n1*n2));
        }
        else if (c.equals("/")){
            System.out.println(n1+" / "+n2+" = "+(n1/n2));
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1,n2;
        String c;
        n1=scanner.nextInt();
        c=scanner.next();
        n2= scanner.nextInt();
        arithmetic(n1,c,n2);
    }
}
