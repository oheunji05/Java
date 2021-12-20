public class Man {
    int avg;
    String name;
    boolean isMarried;
    int children;

    public static void main(String[] args) {
        Man man=new Man();
        man.avg=40;
        man.name="James";
        man.isMarried=true;
        man.children=3;
        System.out.println(man.avg);
        System.out.println(man.name);
        System.out.println(man.isMarried);
        System.out.println(man.children);
    }
}
