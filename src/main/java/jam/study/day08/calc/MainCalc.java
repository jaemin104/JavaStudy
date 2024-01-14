package jam.study.day08.calc;

public class MainCalc {
    public static void main(String[] args) {
        BasicCalc bc = new BasicCalc();
        int a = 10;
        int b = 20;
        int res = bc.add(a, b);
        System.out.println(res);

        res = bc.sub(a, b);
        System.out.println(res);

        res = bc.mul(a, b);
        System.out.println(res);

        double res1 = bc.div(a, b);
        System.out.println(res1);
    }
}
