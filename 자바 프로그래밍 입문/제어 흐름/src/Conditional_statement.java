public class Conditional_statement {
    //조건문
    public static void main(String[] args) {

        //if, if else문

        // if(조건식){
        //   수행문1 (조건식이 참일 경우에 수행)
        // }

        // else{
        //   수행문2 (조건식이 거짓일 경우에 수행)
        // }

        int age = 7;
        if (age >= 8) { //age 값이 8 이상이면
            System.out.println("학교에 다닙니다");//실행
        } else { //age 값이 8 이상이 아니면
            System.out.println("학교에 다니지 않습니다");//실행
        }




        //if else문

        // if(조건식1){
        //   수행문1 (조건식1이 참일 경우에 수행)
        // }

        // else if(조건식2){
        //   수행문2 (조건식2가 참일 경우에 수행)
        // }

        // else if(조건식3){
        //   수행문3 (조건식3이 참일 경우에 수행)
        // }

        // else{
        //   수행문4 (위의 조건이 모두 해당하지 않는 경우에 수행)
        // }

        // 수행문5 (위의 조건문이 끝나고 실행)

        int age1 = 9;
        int charge;

        if (age1 < 8) {
            charge = 1000;
            System.out.println("취학 전 아동입니다");
        } else if (age1 < 14) {
            charge = 2000;
            System.out.println("초등학생입니다");
        } else if (age1 < 20) {
            charge = 2500;
            System.out.println("중, 고등학생 입니다");
        } else {
            charge = 3000;
            System.out.println("일반인입니다");
        }

        System.out.println("입장료는" + charge + "원입니다");




        //조건문과 조건 연산자

        int a = 1, b = 2;
        int max;
        if (a > b)
            max = a;
        else
            max = b;

        max = (a > b) ? a : b;




        //switch case문

        //switch(조건){
        //  case 값1:수행문1;
        //          break;
        //  case 값2:수행문2;
        //          break;
        //  case 값3:수행문3;
        //          break;
        //  default:수행문4;
        //}

        int rank=1;
        char medalColor;

        switch(rank){
            case 1: medalColor='G';
                    break;//switch case 문을 빠져나오게 하는 역할
            case 2:medalColor='S';
                    break;
            case 3: medalColor='B';
                    break;
            default:
                    medalColor='A';
        }
        System.out.println(rank+"등 메달의 색은"+medalColor+"입니다");
    }
}