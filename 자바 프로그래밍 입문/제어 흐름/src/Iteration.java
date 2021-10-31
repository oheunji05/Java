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
        System.out.println("1부터 10까지의 합은 "+num+"입니다");

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
        while (num<=10);

        System.out.println("1부터 10까지의 합은"+sum1+"입니다");
    }
}
