package jam.study.day04;

import jam.study.day01.Main;

public class MainTest {
    public static void main(String[] args) {
        MainTest mt = new MainTest();

        int a = 10;
        int b = 20;
        int c = mt.add(a, b);
        System.out.println(c);
    }

    private int add(int a, int b) {
        return a+b;
    }
}
