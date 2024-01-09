package jam.study.day05;

public class MainUpcasting {
    public static void main(String[] args) {
        SuperClass sup = new SuperClass();
        System.out.println(sup.a);

        SubClass sub = new SubClass();
        System.out.println(sub.b);

        sup = sub;
        System.out.println(sup.a);
        System.out.println(sub.b);

        
    }
}
