public class Arithmetic_Operation_Function {

    public static void main(String[] args) {
        int n1=1,n2=2;
        int add=Add(n1,n2);
        int sub=Sub(n1,n2);
        int mul=Mul(n1,n2);
        int div=Div(n1,n2);
        System.out.println("add: "+add);
        System.out.println("sub: "+sub);
        System.out.println("mul: "+mul);
        System.out.println("div: "+div);
    }

    public static int Add(int n1,int n2){
        return n1+n2;
    }
    public static int Sub(int n1,int n2){
        return n1-n2;
    }
    public static int Mul(int n1,int n2){
        return n1*n2;
    }
    public static int Div(int n1,int n2){
        return n1/n2;
    }
}
