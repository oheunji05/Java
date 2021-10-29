public class Variable {
    public static void main(String[] args) {

        //변수 선언, 초기화, 출력
        int level;
        level=10;
        System.out.println(level);

        int age=17;
        System.out.println(age);

        int year=2018;
        System.out.println(year);

        //byte 1바이트
        byte bs1=-128;
        //byte bs2=128; 바이트 범위를 초과

        //short 2바이트

        //int 4바이트

        //long 8바이트
        long num=12345678900L; // int형 범위를 초과하는 수는 뒤에 L이나 l 붙이기
        long num1=1000;

        //char
        char ch1='A';
        System.out.println(ch1);
        System.out.println((int)ch1);//아스키 코드 값 출력

        char ch2=66;
        System.out.println(ch2);

        char ch3=67;
        System.out.println(ch3);
        System.out.println((char)ch3);//정수 값에 해당하는 문자 출력

        //문자형
        char char1='한';
        char char2='\uD55C';
        System.out.println(char1);//유니코드
        System.out.println(char2);

        int a=65;
        int b=-66;

        char a2=65;
        //char b2=-66; 문자형 변수에 -를 넣으면 오류 발생

        System.out.println((char)a);
        System.out.println((char)b);//오류 발생으로 ? 출력
        System.out.println(a2);

        //실수형
        //float 4바이트
        //double 8바이트
        double dnum=3.14;
        float fnum=3.14F;

        System.out.println(dnum);
        System.out.println(fnum);

        //논리형 1바이트
        //어떤 변수의 참, 거짓의 값을 나타냄 true false
        boolean isMarried=true;
        System.out.println(isMarried);

        //var 자료형 추론
        var n=10; //int n
        var dn=10.0; //double dn
        var str="hello"; //String str

        System.out.println(n);
        System.out.println(dn);
        System.out.println(str);

        //상수) 값을 변경할 수 없음
        //final
        final int MAX_NUM=100;
        final int MIN_NUM;

        MIN_NUM=0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        //형 변화

        //묵시적 형 변환
        //바이트 크기가 작은 자료형에서 큰 자료형으로 대입하는 경우
        byte bNum=10;
        int iNum=bNum;

        //덜 정밀한 자료형에서 더 정밀한 자료형으로 대입하는 경우
        int iNum2=20;
        float fNum=iNum2;

        //연산 중에 자동으로 변환되는 경우
        int iNum3=20;
        float fNum1=iNum3;
        double dNum;
        dNum=fNum1+iNum3;

        /*//명시적 형 변환
        //바이트 크기가 큰 자료형에서 작은 자료형으로 대입하는 경우
        int iNum=10;
        byte bNum=(byte)iNum;

        int iNum=1000;
        byte bNum=(byte)iNum;

        //더 정밀한 자료형에서 덜 정밀한 자료형으로 대입하는 경우
        double dNum=3.14;
        int iNum2=(int)dNum;

        //연산 중 형 변환
        double dNum1=1.2;
        float fNum2=0.9F;

        int iNum3=(int)dNum1+(int)fNum2;//두 실수가 각각 형 변환되어 더해짐
        int iNum4=(int)(dNum1+fNum2);//두 실수의 합이 먼저 계산되고 형 변환됨
        System.out.println(iNum3);
        System.out.println(iNum4);*/





    }
}
