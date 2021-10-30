public class Operator {
    public static void main(String[] args) {
        //단항 연산자 num++
        //이항 연산자 num1+num2
        //삼항 연산자 (5>3)? 1:0

        //대입 연산자
        //오른쪽 값을 왼쪽에 대입
        int age=24;

        //부호 연산자 + -
        int num=10;

        System.out.println(+num);//10
        System.out.println(-num);//-10
        System.out.println(num);//10

        num=-num;
        System.out.println(num);//-10

        //산술 연산자 (사칙 연산)
        int mathScore=90;
        int engScore=70;

        int totalScore=mathScore+engScore;
        System.out.println(totalScore);

        double avgScore=totalScore/2.0;
        System.out.println(avgScore);

        //증가 감소 연산자
        int gameScore=150;

        int lastScore1=++gameScore;
        System.out.println(lastScore1);

        int lastScore2=--gameScore;
        System.out.println(lastScore2);

        //관계 연산자
        int myAge=27;
        boolean value=(myAge>25);
        System.out.println(value);

        //논리 연산자 && || !
        int num1=10;
        int num2=20;

        boolean flag=(num1>0)&&(num2>0);
        System.out.println(flag);

        flag=(num1<0)&&(num2>0);
        System.out.println(flag);

        flag=(num1<0)||(num2>0);
        System.out.println(flag);

        //조건 연산자
        int fatherAge=45;
        int motherAge=47;

        char ch;
        ch=(fatherAge > motherAge)?'T':'F';

        System.out.println(ch);//F

        //비트 연산자
        //& 연산자 (and)
        //| 연산자 (or)
        //^ 연산자 (xor)
        //~ 연산자 (not)

        //비트 이동 연산자
        //<< 왼쪽으로 비트를 이동
        //int num=5;//00000101
        //num<<2;//00010100

        //>> 오른쪽으로 비트를 이동
        //int num=10;//00001010
        //num>>2;//00000010
    }
}
