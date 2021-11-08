import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=0;
        int odd=0;
        int even=0;
        while(true){
            i= scanner.nextInt();
            if(i==0){
                break;
            }
            if(i%2!=0){
                odd++;
            }
            else if(i%2==0){
                even++;
            }
            i++;
        }
        System.out.println("odd : "+odd);
        System.out.print("even : "+even);
    }
}
