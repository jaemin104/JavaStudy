package jam.study.day02;

public class MainAB {
    public static void main(String[] args) {
        B aaa = new B(10,20);
        B bbb = new B(100, 200);

        System.out.println(aaa.getNum1());
        System.out.println(aaa.getNum2());
        System.out.println(bbb.getNum1());
        System.out.println(bbb.getNum2());
        System.out.println();

        aaa = bbb;

        System.out.println(aaa.getNum1());
        System.out.println(aaa.getNum2());
        System.out.println(bbb.getNum1());
        System.out.println(bbb.getNum2());
    }
}
