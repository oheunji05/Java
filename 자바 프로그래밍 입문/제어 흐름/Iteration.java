public class Iteration {
    //반복문
    public static void main(String[] args) {
        //while문

        //while(조건식){
        //수행문1;
        //}
        //수행문2;

        int num=1;
        int sum=0;

        while(num<=10){//num 값이 10보다 작거나 같을 동안
            //조건문이 참일 경우
            sum+=num;//sum=sum+num
            num++;//num에 1씩을 더함
        }
        System.out.println("1부터 10까지의 합은 "+sum+" 입니다");

        //while(true){ //무한 반복
        //}




        //do while문

        //do{
        //수행문1;
        //}
        //while{
        //수행문2;
        //}
        
        int num1=1;
        int sum1=0;
        
        do{
            sum1+=num1;
            num1++;
        }
        while (num1<=10);

        System.out.println("1부터 10까지의 합은 "+sum1+" 입니다");




        //for문

        //for(초기화식;조건식;증감식;){
        //수행문
        //}

        int i;
        int sum2=0;

        for(i=1;i<=10;i++){
            sum2+=i;
        }
        System.out.println("1부터 10까지의 합은 "+sum2+" 입니다");

        //for(;;) //무한반복




        //continue문
        //특정 조검에서는 수행하지 않고 건너뛰어야 할 때 사용

        int total=0;
        int n;

        for(n=1;n<=100;n++){
            if(n%2==0){
                continue;
            }
            total+=n;
        }
        System.out.println("1부터 100까지의 홀수의 합은 "+total+" 입니다");




        //break문
        //break를 만나면 그 지점에서 더이상 수행문을 반복하지 않고 반복문을 빠져나온다

        int s=0;
        int n1=0;

        for(n1=0;s<100;n1++){
            s+=n1;
        }
        System.out.println("n1: "+n1);
        System.out.println("s : "+s);
    }
}
