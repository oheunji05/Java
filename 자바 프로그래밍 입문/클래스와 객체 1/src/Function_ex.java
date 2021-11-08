public class Function_ex {

    //예제1
    int add(int num1,int num2){
        int result;
        result=num1+ num2;
        return result;
    }


    //예제2
    int getTenTotal(){
        int i;
        int total=0;
        for(i=1;i<=10;i++){
            total+=i;
        }
        return total;
    }


    //예제3
    void printGreeting(String name){
        System.out.println(name+"님 안녕하세요");
        return; //반환 값 없음
    }


    //예제4
    void divide(int num1,int num2){
        if(num2==0){
            System.out.println("나누는 수는 0이 될 수 없습니다");
            return; //함수 수행을 종료하는 예약어
        }
        else {
            int result=num1/num2;
            System.out.println(num1+"/"+num2+"="+result+"입니다");
        }
    }
}
