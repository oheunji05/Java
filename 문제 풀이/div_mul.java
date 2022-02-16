//import java.util.Scanner;
////서로 다른 두 개의 정수가 주어진다.
////
////두 정수를 입력받아 큰 수는 2로 나눈 몫을 저장하고 작은 수는 2를 곱하여 저장한 후 출력하는 프로그램을 작성하시오.
////
////(참조에 의한 호출을 이용한 함수를 작성하여 값을 수정하고 출력은 메인함수에서 한다.)
////
////입력 예
////100 500
////출력 예
////200 250
//public class div_mul {
//    public static int div_mul(int n1,int n2){
//        int big;
//        int min;
//        if(n1>n2){
//            big=n1/2;
//            min=n2*2;
//            return big, min;
//        }
//        else{
//            big=n2/2;
//            min=n1*2;
//            return big, min;
//        }
//    }
//    public static void main(String[] args) {
//        int n1,n2;
//        Scanner scanner=new Scanner(System.in);
//        n1= scanner.nextInt();
//        n2=scanner.nextInt();
//        System.out.println(div_mul(n1,n2));;
//    }
//}
